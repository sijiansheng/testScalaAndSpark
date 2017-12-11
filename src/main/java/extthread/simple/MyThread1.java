package extthread.simple;

/**
 * @author sijiansheng
 **/
public class MyThread1 extends Thread {

    public void run() {

        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Run1{
    public static void main(String[] args){
        MyThread1 mythread = new MyThread1();
        System.out.println("begin ="+System.currentTimeMillis());
        mythread.start();
        System.out.println("end ="+System.currentTimeMillis());
    }
}


