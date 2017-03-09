package testscala.testnull

/**
  * Created by sijiansheng on 2016/9/22.
  * 测试scala在需要返回值得情况下返回null
  */
object TestReturnNull {

//  def getDate(param:Int):List[String]={
//
//    param match{
//      case 1 => List("1")
//      case 2 => List("2")
//      case 3 => List("3")
//      case 4 => null
//    }
//  }
//
//  def main(args: Array[String]) {
//    println(getDate(4))
//  }

//  Null是所有AnyRef的子类，在scala的类型系统中，AnyRef是Any的子类，
  // 同时Any子类的还有AnyVal。对应java值类型的所有类型都是AnyVal的子类。所以Null可以赋值给所有的引用类型(AnyRef)，不能赋值给值类型，这个java的语义是相同的。 null是Null的唯一对象。
  //string属于anyref类型

  def getData(param:Int):Tuple2[String,String]={


    return null
  }
}
