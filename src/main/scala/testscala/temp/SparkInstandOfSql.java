package testscala.temp;


import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.netlib.util.doubleW;
import org.netlib.util.intW;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class SparkInstandOfSql {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("hh").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<ObjectNode> rdd = sc.textFile("e://data.txt").map(new Function<String, ObjectNode>() {
            @Override
            public ObjectNode call(String v1) throws Exception {
                ObjectMapper om = new ObjectMapper();
                ObjectNode on = (ObjectNode) om.readTree(v1);
                return on;
            }
        });
//        TempFile(rdd).foreach(x-> System.out.println(x));
    }

    public static JavaRDD<Double> TempFile(JavaRDD<ObjectNode> temp) {
        JavaRDD<Double> rdd1 = temp.map(new Function<ObjectNode, Double>() {
            private static final long serialVersionUID = 1L;

            @Override
            public Double call(ObjectNode v1) throws Exception {
                JsonNode jsonNode = v1.get("loanDocument");
                Double json = jsonNode.get("amount").asDouble();
                //  on.put("selleName",jsonNode.asDouble() );
                return json;
            }
        });
        return rdd1;
    }
}