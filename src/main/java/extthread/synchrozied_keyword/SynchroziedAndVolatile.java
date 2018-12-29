package extthread.synchrozied_keyword;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName SynchroziedAndVolatile
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/28 20:18
 */
public class SynchroziedAndVolatile {

    public static void main(String[] args) {

        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为false");

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


class RunThread extends Thread {

    private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true) {
        }
        System.out.println("线程被停止了！");
    }

}