package tech.codingclub;

import java.util.Date;

public class HelloWorld {
    //To access this we need an object first of HelloWorld class
    //But static makes it possible without objects
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth. Hello World running at "+ new Date().toString() +"sharp");
    }
}
