package testscala.feature.java;

/**
 * Created by sijiansheng on 2016/6/3.
 */
public class Contravariance {
}

class Supper1 {
    void doSomething(String parameter) {

    }
}

class Sub1 extends Supper1 {
    void doSomething(Object parameter) {

    }
}
//Sub1.doSomething()是一个逆变类型，因为它的输入参数是Super1.doSomething的父类