package extthread.simple;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName VolatileTest
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/25 16:33
 */
public class VolatileTest {

    int a = 0;
    volatile boolean flag = false;

    public void writer() {
        a = 1;// 1
        flag = true;// 2
    }

    public void reader() {
        if (flag) {
            int i = a;// 3
            System.out.println(i);// 4
        }
    }

}
