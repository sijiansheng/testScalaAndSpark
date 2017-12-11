package test.double_test;

/**
 * Created by sijiansheng on 2017/11/23.
 */
public class DoubleZeroEqual {

    public static void main(String[] args) {
        System.out.println(new Double(0.0) == new Double(0));
        System.out.println(new Double(0.000) == new Double(0));
        System.out.println((new Double(1.10)) == (new Double(1.1)));
        System.out.println(((double) new Double(1.10)) == ((double) new Double(1.1)));
        System.out.println(((double) new Double(0.0)) == ((double) new Double(0)));
        System.out.println(((double) new Double(0.00)) == ((double) new Double(0.0)));
        System.out.println(((double) new Double(0.00)) == 0d);
        System.out.println(0.0 == 0d);
        System.out.println(0.00000 == 0d);
        System.out.println(0.0d == 0d);
    }
}
