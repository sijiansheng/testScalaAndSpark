package extthread.daemon;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName MyTask
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/28 19:19
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为：" + new Date());
    }
}
//普通线程版本
class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date date = calendar.getTime();
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, date);
        //执行完jvm不会停止
    }
}
//守护线程版本
 class Test2 {
    public static void main(String[] args){
        System.out.println("当前时间："+new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date date=calendar.getTime();
        MyTask task=new MyTask();
        Timer timer=new Timer(true);
        timer.schedule(task,date);
        //执行完jvm自动停止
    }
}