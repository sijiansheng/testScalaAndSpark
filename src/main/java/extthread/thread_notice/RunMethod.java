package extthread.thread_notice;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName RunMethod
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/12/29 10:37
 */

class ValueObject {
    private String value;

    String get() {
        return value;
    }

    void set(String value) {
        this.value = value;
    }
}

public class RunMethod {

    private Object lock;
    private ValueObject valueObject;

    public RunMethod(Object lock, ValueObject valueObject) {
        this.lock = lock;
        this.valueObject = valueObject;
    }

    public void setValue() {
        System.out.println("setValue方法执行");
        try {
            synchronized (lock) {
                if (!valueObject.get().equals("")) {
                    System.out.println("切换为读线程");
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_"
                        + System.nanoTime();
                System.out.println("set" + value);
                valueObject.set(value);
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue方法执行");
        try {
            synchronized (lock) {
                if (valueObject.get().equals("")) {
                    System.out.println("切换为写线程");
                    lock.wait();
                }
                System.out.println("get" + valueObject.get());
                valueObject.set("");
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {

    RunMethod p;

    public Producer(RunMethod p) {
        this.p = p;
    }

    public void run() {
        while (true) {
            p.setValue();
        }
    }
}

class Consumer extends Thread {

    RunMethod p;

    public Consumer(RunMethod p) {
        this.p = p;
    }

    public void run() {
        while (true) {
            p.setValue();
        }
    }
}

class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ValueObject valueObject = new ValueObject();
        valueObject.set("");
        RunMethod runMethod = new RunMethod(lock, valueObject);
        Producer producer = new Producer(runMethod);
        Consumer consumer = new Consumer(runMethod);
        producer.start();
        consumer.start();
    }
}
