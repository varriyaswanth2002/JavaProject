package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth. Hello World running at "+ new Date().toString() +"sharp");
        Stack<String>stack = new Stack<>();
        Stack<Integer>stackInteger = new Stack<Integer>();

        //push or add element
        stackInteger.push(2);
        stackInteger.push(5);
        stackInteger.push(10);
        stackInteger.push(101);

        //pop or remove top element
        int topElementPoped = stackInteger.pop();//101
        //2 5 10
        //what is top?
        System.out.println("Top Element :"+stackInteger.peek());
        //Search
        int index = stackInteger.search(5);
        int find200 = stackInteger.search(200);
        System.out.println("Index of 5 :"+index);
        System.out.println("Index of 200 :"+find200);

        Iterator<Integer>integerIterator = stackInteger.iterator();
        while(integerIterator.hasNext()){
            System.out.println("Iterator showing element :"+integerIterator.next());
        }
        //check whether stack is empty or not?
        //stackInteger.empty();
        while(!stackInteger.empty()){
            int topElement = stackInteger.pop();
            System.out.println("Popped :"+topElement);
        }

    }
}
