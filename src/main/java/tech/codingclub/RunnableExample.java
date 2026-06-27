package tech.codingclub;

import java.util.Date;

public class RunnableExample implements Runnable{
    private String threadName;
    private int counter;
    private int waitTimeWhileLoop;
    public RunnableExample(String threadName, int counter, int waitTimeWhileLoop){
        this.threadName = threadName;
        this.counter = counter;
        this.waitTimeWhileLoop = waitTimeWhileLoop;
    }
    @Override
    public void run() {
        while(counter<100){
            counter++;
            try {
                Thread.sleep(waitTimeWhileLoop);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName+":"+counter);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is varri yaswanth");
        System.out.println("ThreadExample running at+ "+new Date().toString()+" sharp.");
        RunnableExample runnable1 = new RunnableExample("THREAD_A",0,500);
        RunnableExample runnable2 = new RunnableExample("THREAD_B",0,1000);
        RunnableExample runnable3 = new RunnableExample("THREAD_C",0,2000);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("came here before threads end!");
    }


}
