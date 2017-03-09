package testscala.temp;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.api.java.UDF1;
import org.apache.spark.sql.types.DataTypes;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.Iterator;

/**
 * Created by sijiansheng on 2016/10/17.
 */
public class Udf {

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("hh").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);
        SQLContext sqlctx = new SQLContext(sc);

        // DataFrame df1 = sqlctx.read().json("file:/C:/Users/admin/Desktop/spark/part-00000");
        DataFrame df1 =  sqlctx.read().json("E://data.txt");
//        DataFrame df1 = sqlctx.read().format("json").load("E://data.txt");
        System.out.println("打印初始dataframe");
        df1.show();
        df1.printSchema();
        df1.select("loanDocument").show();

        df1.registerTempTable("loan"); //注册成为临时表
        System.out.println("打印简单查询dataframe");
        DataFrame df3 = sqlctx.sql("select loanDocument.amount,loanDocument.seller_id,loanDocument.write_off_amount from loan");
        //df3.show();

        sqlctx.udf().register("hh", new UDF1<String, Integer>() {
            private static final long serialVersionUID = 1L;

            public Integer call(String str) throws Exception {
                ObjectMapper om = new ObjectMapper();
                JsonNode rootNode = om.readTree(str);
                JsonNode amount = rootNode.get("amount");
                //JSONArray jsonArray = (JSONArray) rootNode.getJSONObject("amount");
                return Integer.parseInt(amount.toString());

            }
        }, DataTypes.IntegerType);
        DataFrame df5 = sqlctx.sql("select hh(loanDocument) as num from loan");

        df5.printSchema();
//        System.out.println(df5.count());
//        df5.toJSON().toJavaRDD().take(3).forEach(x->{
//            System.out.println(x);
//        });
        Iterator iterator =  df5.toJSON().toJavaRDD().take(3).iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        df5.show();
    }
}
