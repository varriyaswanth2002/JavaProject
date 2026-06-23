package tech.codingclub;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth. Hello World running at "+ new Date().toString() +"sharp");

        ArrayList<String>emails= new ArrayList<String>();


        emails.add("admin@linkedin.com");
        emails.add("contact@codingclub.tech");
        emails.add("admin@google.com");
        System.out.println("###BEFORE SORTING###");
        for(String mail:emails){
            System.out.println(mail);
        }
        System.out.println("###AFTER SORTING###");
        Collections.sort(emails);
        for(String mail:emails){
            System.out.println(mail);
        }

        int arr[]={34,12,565,3,6534,32,56,77};
        Arrays.sort(arr);
        for(int element:arr){
            System.out.println(element);
        }
    }
}
