package testscala.resource

/**
  * Created by sijiansheng on 2016/11/16.
  */
object TestResource extends App{

//  如果项目没有resource文件夹，可以自己建一个resource目录
  println(getClass.getResource("/dd").getPath)
}
