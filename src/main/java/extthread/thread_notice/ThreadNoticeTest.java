package extthread.thread_notice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName ThreadNoticeTest
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/29 9:57
 */
public class ThreadNoticeTest {

    public static void main(String[] args) {
        Object lock = new Object();
        ArrayList list = new ArrayList<String>();
        ThreadA threadA = new ThreadA(list, lock);
        ThreadB threadB = new ThreadB(list, lock);
        threadB.start();
        threadA.start();
    }
}

class ThreadA extends Thread {

    List<String> list;
    private Object lock;

    public ThreadA(List list, Object lock) {
        this.list = list;
        this.lock = lock;
    }

    public void run() {

        synchronized (lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    list.add("" + i);
                    System.out.println("添加了" + (i + 1) + "个元素");
                    System.out.println("list.size:" + list.size());
                    if (list.size() == 5) {
                        lock.notify();
                        System.out.println("已发出通知！");
                        Thread.sleep(1000);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class ThreadB extends Thread {

    List<String> list;
    private Object lock;

    public ThreadB(List list, Object lock) {
        this.list = list;
        this.lock = lock;
    }

    public void run() {

        synchronized (lock) {

            try {
                if (list.size() != 5) {
                    System.out.println("wait begin "
                            + System.currentTimeMillis());
                    System.out.println("wait,wait notice");
                    lock.wait();
                    System.out.println("wait end  "
                            + System.currentTimeMillis());
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}