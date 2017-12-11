package equal;

/**
 * Created by sijiansheng on 2017/2/21.
 */
public class TestEqual {

    public static void main(String[] args) {

        String a = "asd";
        String c = "asd";
        String b = new String("asd");
        System.out.println(a == b);// p:false a:false
        System.out.println(a == c);//p:false a:true

//        new，会在java的堆内存中创建对象, 有几个new就有几个对象。
//        直接赋值, 是从字符串常量池中取值。
//        例如 String str1 = "a"; String str2 = "a"; System.out.println(str1==str2);结果为true,地址值
//        都是字符串长量池中的"a".
//        String str3 = new String("a");String str4 = new String("a");System.out.println(str3==str4);
//        结果为false. 应为new会在堆中创建两个字符串对象, 地址值不同
//        网址     http://blog.csdn.net/u014082714/article/details/50087563

        String a1 = "asd";
        String c1 = "asd";
        System.out.println(c1);
        System.out.println(c1.hashCode());
        c1 = "df";
        System.out.println(c1.hashCode());
        String b1 = new String("asd");
        System.out.println(c1);// p:false a:false
        System.out.println(a1);//p:false a:true
        //java string是不可变的
        //http://www.jb51.net/article/59935.htm 这篇文章比较好
        //java string不可变性 http://www.codeceo.com/article/why-java-string-class-static.html
    }
}
