package testscala.invoke

/**
  * Created by sijiansheng on 2016/8/17.
  */
object TestInvoke extends App{

  //获取无参构造方法
  val constructor = MethodDemo.getClass.getDeclaredConstructor()
  //设置取消访问权限，这是访问私有构造方法的关键
  constructor.setAccessible(true)
  //调用该构造方法，获得对象
  val methodDemo = constructor.newInstance()

//  val method = constructor.getClass.getMethods

  /*
       *  使用反射调用类的私有有参方法
       *  类：MathDemo
       *  方法：private int add(int a,int b)
       */
  //1.根据方法名和方法参数获取方法对象
//  val methodWithParam = MethodDemo.getClass.getDeclaredMethod("methodWithoutParam",java.lang.Integer,Int.getClass,List.getClass)
  //2.取消访问检查，是访问私有方法的关键
  val method = MethodDemo.getClass.getDeclaredMethod("methodWithoutParam")

  method.setAccessible(true)
  //3.调用私有方法并获得返回值
  method.invoke(methodDemo,1:java.lang.Integer,2:java.lang.Integer,List("1"))

  /*
       *  使用反射调用类的私有无参方法
       *  类：MathDemo
       *  方法：private int add(int a,int b)
       */
  //1.根据方法名和方法参数获取方法对象
  //2.取消访问检查，是访问私有方法的关键
  method.setAccessible(true)
  //3.调用私有方法并获得返回值
  method.invoke(methodDemo)
//  /*
//   * 使用反射改变类的私有属性
//   * 类：MathDemo
//   * 属性：private int m = 10;
//   */
//  //1.根据属性名m获取属性
//  Field field = MathDemo.class.getDeclaredField("m");
//  //2.取消访问检查，是访问私有属性的关键
//  field.setAccessible(true);
//  //3.设置私有属性m为20
//  field.setInt(mathDemo, 20);
//  System.out.println(mathDemo.getM());
}

object MethodDemo {
  private val privateData = 10

  def methodWithoutParam(): Unit = {
    println("执行无参方法")
  }

  def methodWithParam(intParam: Int, stringParam: Int, listParam: List[String]): Int = {

    println(intParam)
    println(stringParam)
    println(listParam)
    intParam + stringParam.toInt
  }
}