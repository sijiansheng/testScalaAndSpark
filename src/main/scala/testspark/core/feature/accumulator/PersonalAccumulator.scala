package testspark.core.feature.accumulator

/**
  * Created by sijiansheng on 2016/11/2.
  */

import org.apache.spark.AccumulatorParam

object PersonalAccumulator {

  def main(args: Array[String]) {

    object SessionAggrStatAccumulator extends AccumulatorParam[String] {

      /**
        * 初始化和方法
        *
        * @param initialValue
        * @return
        */
      def zero(initialValue: String): String = {
        "sum1 =0|sum2 =0|sum3 =0|sum4 =0|sum5 =0|sum6 =0|sum7 =0|sum8 =0"
      }


      /**
        * 其次需要实现一个累加方法
        *
        * @param v1
        * @param v2
        * @return
        */
      def addInPlace(v1: String, v2: String): String = {


        /**
          * 如果初始值为空,那么返回v2
          */
        if (v1 == "") {
          v2
        } else {

          /**
            * 从现有的连接串中提取v2所对应的值
            */

          def getFlagAndVaule(specialValue: String): collection.mutable.LinkedHashMap[String, Int] = {

            val mapResult = collection.mutable.LinkedHashMap[String, Int]()

            specialValue.split("\\|").toList.map(line => {
              val result = line.split("=")
              val flag = result(0).trim
              val value = result(1).toInt
              mapResult.put(flag, value)
            })

            mapResult
          }

          val oldValues = getFlagAndVaule(v1)
          val accumulators = getFlagAndVaule(v2)

          for (key <- oldValues.keys) {
            val lastValue = oldValues(key)
            val accumulator = accumulators.getOrElse(key, 0)
            oldValues.put(key, lastValue + accumulator)
          }

          oldValues.map(line => line._1 + " =" + line._2).mkString("|")
        }
      }
    }

    val sc = testspark.sparkContext

    val lastValue = sc.accumulable("")(SessionAggrStatAccumulator)
    lastValue += "sum1 =1| sum2 =0|sum3 =3|sum4 =0|sum5 =0|sum6 =0|sum7 =0|sum8 =0"
    lastValue += "sum1 =1| sum2 =1|sum3 =1|sum4 =1|sum5 =1|sum6 =0|sum7 =0|sum8 =1"
    println(lastValue)

  }
}
