package extthread.synchrozied_keyword;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName Test11
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/28 20:01
 */
public class ObjectService {

    public synchronized static void methodA() {
        try {
            System.out.println("static methodA begin 线程名称:" + Thread.currentThread().getName() + " times:" + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("static methodA end   线程名称:" + Thread.currentThread().getName() + " times:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void methodB() {
        System.out.println("static methodB begin 线程名称:" + Thread.currentThread().getName() + " times:" + System.currentTimeMillis());
        System.out.println("static methodB end   线程名称:" + Thread.currentThread().getName() + " times:" + System.currentTimeMillis());
    }
}

class ThreadA extends Thread {

    @Override
    public void run() {
        ObjectService.methodA();
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        ObjectService.methodB();
    }
}

class MainTest {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}