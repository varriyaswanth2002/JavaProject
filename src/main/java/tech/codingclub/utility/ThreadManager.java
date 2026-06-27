package tech.codingclub.utility;

import tech.codingclub.RunnableExample;

import java.util.Date;

public class ThreadManager {
    public static void main(String[] args) {
        System.out.println("This is varri yaswanth");
        System.out.println("Thread Manager is running at "+new Date().toString()+" sharp.");
        TaskManager taskManager = new TaskManager(100);
        for(int i=0;i<10000;i++){
            RunnableExample temp = new RunnableExample("ThreadNo-"+i,0,500+i);
            taskManager.waitTillQueueIsFreeAndAddTask(temp);
            System.out.println("$$$$$"+i);
        }
        System.out.println("can we come here before threads are done");
    }
}
