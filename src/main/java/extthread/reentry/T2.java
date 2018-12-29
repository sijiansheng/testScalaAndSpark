package extthread.reentry;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName T2
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/28 19:36
 */
public class T2 {
    public static void main(String[] args) {
        Service11 service11 = new Service11();
        service11.service2();
        MyThread4 thread = new MyThread4(service11);
        thread.start();
        service11.service3();
    }
}

class MyThread4 extends Thread {
    Service11 s;

    public MyThread4(Service11 s) {
        this.s = s;
    }

    public void run() {
        s.service1();
    }
}

class Service11 {

    synchronized void service1() {
        System.out.println("执行service1方法");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized void service2() {
        System.out.println("执行service2方法");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void service3() {
        System.out.println("执行service3方法");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
