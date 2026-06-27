package tech.codingclub;

import java.util.Date;

public class ThreadExample extends Thread{
    private String threadName;
    private int counter;
    private int waitTimeWhileLoop;
    public ThreadExample(String threadName,int counter,int waitTimeWhileLoop){
        this.threadName = threadName;
        this.counter = counter;
        this.waitTimeWhileLoop = waitTimeWhileLoop;
    }
    public void run(){
        while(counter<1000){
            counter++;
            try {
                Thread.sleep(waitTimeWhileLoop);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(threadName+":"+counter);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is varri yaswanth");
        System.out.println("ThreadExample running at+ "+new Date().toString()+" sharp.");
        ThreadExample thread1 = new ThreadExample("THREAD_A",0,500);
        ThreadExample thread2 = new ThreadExample("THREAD_B",0,1000);
        ThreadExample thread3 = new ThreadExample("THREAD_C",0,2000);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("came here before threads end!");
    }
}
