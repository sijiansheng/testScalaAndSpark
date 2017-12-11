package keywordtest;

/**
 * Created by sijiansheng on 2017/10/12.
 */
public class AssertTest {
    public static void main(String[] args) {

//        assert Integer.parseInt(args[0]) > 10;
//        System.out.println("a");
//        test1(-1);
//        test2(10);
//        assert false:"表示错误";
//        test2(20);

        assert true;
        System.out.println("断言1没有问题，Go！");

        System.out.println("\n-----------------\n");

        //断言2结果为false,程序终止
        assert false : "断言失败，此表达式的信息将会在抛出异常的时候输出！";
        System.out.println("断言2没有问题，Go！");
    }

    public static void test1(int a) {
        assert a > 0;
         System.out.println("a > 0");
    }

    public static void test2(int b) {
        assert b < 10 : "b < 10";
        System.out.println("b < 10输出");
    }
}
