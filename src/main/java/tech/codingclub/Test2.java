package tech.codingclub;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth. Hello World running at "+ new Date().toString() +"sharp");
        //Add two numbers
        int a = 400;
        int b  = 8;
        int c = a+b;
        System.out.println("sum of "+a+"+"+b+"="+c);
        double wideVariable = a;
        System.out.println("Widening Variable value"+"="+wideVariable);
        wideVariable = a+0.1;
        System.out.println("Modified Widening Variable value"+"="+wideVariable);
        int narrowVariable = (int) wideVariable;
        System.out.println("Narrowing vairable value"+"="+narrowVariable);
        int overflowVariable = Integer.MAX_VALUE;
        System.out.println("Max value of int"+"="+overflowVariable);
        int underflowVariable = Integer.MIN_VALUE;
        System.out.println("Min value of int"+"="+underflowVariable);
        overflowVariable+=4;
        System.out.println("Modified Max value of int"+"="+overflowVariable);
    }
}
