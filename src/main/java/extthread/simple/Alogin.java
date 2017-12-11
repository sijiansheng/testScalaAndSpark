package extthread.simple;

/**
 * Created by sijiansheng on 2017/4/24.
 */
public class Alogin extends Thread {

    public void run() {
        LoginSevlet.doPost("a", "aa");
    }
}

class Blogin extends Thread {

    public void run() {
        LoginSevlet.doPost("b", "bb");
    }
}

class Run {

    public static void main(String[] args) {

        Alogin a = new Alogin();
        a.start();
        Blogin b = new Blogin();
        b.start();
        //执行速度导致的冲突
    }
}