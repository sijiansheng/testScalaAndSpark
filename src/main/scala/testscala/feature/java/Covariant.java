package testscala.feature.java;

/**
 * Created by sijiansheng on 2016/6/3.
 * java 协变案例
 */
public class Covariant {

}

class Supper {
    Object getSomeThing() {
        return "";
    }
}

class Sub extends Supper {
    String getSomething() {
        return "";
    }
}

//sub.getSomething()是一个协变类型，因为他的返回类型是Super.getSomething()返回类型的值类型。