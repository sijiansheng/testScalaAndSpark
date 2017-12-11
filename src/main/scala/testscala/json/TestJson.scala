package testscala.json

import play.api.libs.json.{JsObject, JsValue, Json}

import scala.collection.Seq
import scala.language.implicitConversions

/**
  * Created by sijiansheng on 2016/10/13.
  */
sealed trait JsValueWrapper extends NotNull

private case class JsValueWrapperImpl(field: JsValue) extends JsValueWrapper

object TestJson {

  def main(args: Array[String]) {

    val json = Json.parse("{\n    \"data\": \"data\",\n    \"name\": \"name\"\n}")
//    val data = (json \ "data").as[Long]
//    val name = (json \ "name").as[Long]  此方法对scala jdk有要求
    //    val wrong = Try((json \ "wrong").get) match {
    //      case Success(test) => test
    //      case Failure(e) =>
    //        println(e.getMessage)
    //        null
    //    }
    //
    //    println(data)
    //    println(name)
    //    println(wrong)

    //    val strings = ("11","12","13")
    //    val list = List("11","12","13")
    //    list.toHList[String::String::String::HNil]

    //
    //    val jsonMap:Seq[(String,JsValueWrapper)] = Seq(("uid",data),("session",name))
    //    val fields: Seq[(String, JsValue)] = jsonMap.map(f=>(f._1,f._2.asInstanceOf[JsValueWrapperImpl].field))
    //    val resultValue = JsObject(fields)
    //    println(resultValue)

  }

}
