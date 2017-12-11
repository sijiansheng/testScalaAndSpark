package extthread.volatile_test;

/**
 * Created by sijiansheng on 2017/5/8.
 */
class Run1 {

    public static void main(String[] args) {
        PrintSting printStingService = new PrintSting();
        printStingService.printStringMethod();
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        printStingService.setCountinuePrint(false);
    }
}

class PrintSting {

    private boolean isCountinuePrint = true;

    public void setCountinuePrint(boolean countinuePrint) {
        this.isCountinuePrint = countinuePrint;
    }

    public boolean isCountinuePrint() {
        return isCountinuePrint;
    }

    public void printStringMethod() {

        try {
            while (isCountinuePrint) {
                System.out.println("run printStringMethod threadName =" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            System.out.println("线程终止了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}