package finaltest

/**
  * Created by sijiansheng on 2016/9/8.
  */
object TryTestFinal {

  def tryAccessingLocalVariable: Unit ={
    var number = 123
    println(number)

    var lambda = () =>{
      number = 456
      println(number)
    }

    lambda.apply()
    println(number)
  }

  def main(args: Array[String]) {
    tryAccessingLocalVariable
  }
}
