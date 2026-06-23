package tech.codingclub;

import java.util.ArrayList;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("This side is Varri Yaswanth");
        System.out.println("Test 7 running at "+ new Date().toString()+" sharp.");

        ArrayList<String> arrayList = new ArrayList<String>();
        //Add Items
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("Java");
        arrayList.add("Code");
        //index from 0
        String first = arrayList.get(0);
        System.out.println("First one: "+first);
        //updated at index 2
        arrayList.set(2,"THE");
        int size = arrayList.size();
        //Last element remove
        arrayList.remove(size-1);
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        arrayList.clear();
        System.out.println("Size after clearing: "+arrayList.size());

    }
}
