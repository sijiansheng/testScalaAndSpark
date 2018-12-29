package extthread.daemon;

import java.util.concurrent.TimeUnit;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName DaemonSpawn
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/28 19:23
 */
public class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {

            Thread.yield();

        }

    }
}

class Daemon implements Runnable {
    private Thread[] t = new Thread[10];

    @Override
    public void run() {

        for (int i = 0; i < t.length; i++) {

            t[i] = new Thread(new DaemonSpawn());

            t[i].start();

            System.out.println("DaemonSpawn " + i + " started.");

        }

        for (int i = 0; i < t.length; i++) {

            System.out.println("t[" + i + "].isDaemon() = " +

                    t[i].isDaemon() + ".");

        }

        while (true) {

            Thread.yield();

        }


    }
}

class Test3 {
    public static void main(String[] args) throws InterruptedException {

        Thread d = new Thread(new Daemon());
        d.setDaemon(true); //必须在启动线程前调用

        d.start();

        System.out.println("d.isDaemon() = " + d.isDaemon() + ".");

        TimeUnit.SECONDS.sleep(1);
    }
}
