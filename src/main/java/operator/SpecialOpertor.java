package operator;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName SpecialOpertor
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/11/13 19:08
 */
public class SpecialOpertor {

        public static void main(String[] args) {
            boolean flag = true;
            flag &= true;
            System.out.println("true\t&=\ttrue\t==>\t" + flag);
            flag = true;
            flag &= false;
            System.out.println("true\t&=\tfalse\t==>\t" + flag);
            flag = false;
            flag &= true;
            System.out.println("false\t&=\ttrue\t==>\t" + flag);
            flag = false;
            flag &= false;
            System.out.println("false\t&=\tfalse\t==>\t" + flag+"\n");

            flag = true;
            flag |= true;
            System.out.println("true\t|=\ttrue\t==>\t" + flag);
            flag = true;
            flag |= false;
            System.out.println("true\t|=\tfalse\t==>\t" + flag);
            flag = false;
            flag |= true;
            System.out.println("false\t|=\ttrue\t==>\t" + flag);
            flag = false;
            flag |= false;
            System.out.println("false\t|=\tfalse\t==>\t" + flag+"\n");

            flag = true;
            flag ^= true;
            System.out.println("true\t^=\ttrue\t==>\t" + flag);
            flag = true;
            flag ^= false;
            System.out.println("true\t^=\tfalse\t==>\t" + flag);
            flag = false;
            flag ^= true;
            System.out.println("false\t^=\ttrue\t==>\t" + flag);
            flag = false;
            flag ^= false;
            System.out.println("false\t^=\tfalse\t==>\t" + flag);
    }
}
