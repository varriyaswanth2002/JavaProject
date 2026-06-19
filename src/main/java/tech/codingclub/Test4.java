package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth. Hello World running at "+ new Date().toString() +"sharp");
        int arr[]={10,20,30,40};
        arr[3]=80;
        System.out.println("Last value is:"+arr[arr.length-1]);
        int mArr[][]={{1,2,3,4},{5,6,7,8}};
        System.out.println("Last column last row:"+mArr[1][3]);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        int a=scan.nextInt();
        System.out.println("Enter b:");
        int b= scan.nextInt();
        System.out.println("Sum of a and b = "+ (a+b));
       }
}
