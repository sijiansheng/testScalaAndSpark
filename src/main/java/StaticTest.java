/**
 * Created by sijiansheng on 2017/10/10.
 */
public class StaticTest {
    public static void main(String[] args) {
        A.goHome();
        A  a = new A();
        //result:
//        static a
//        b method
//        go home

    }
}

class A {
    static {
        System.out.println("static a");
        b();
    }
    
    public void A(){
        System.out.println("执行无参构造方法");
    }

    public static void goHome() {
        System.out.println("go home");
    }

    public static void b() {
        System.out.println("b method");
    }
}
