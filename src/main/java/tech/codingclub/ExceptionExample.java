package tech.codingclub;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int x = 100;
        Scanner scanner = new Scanner(System.in);

        try{
            int y = scanner.nextInt();
            int ans = x/y;
            System.out.println("Ans is :"+ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int[] arr = {2, 3, 56};
            System.out.println(arr[100]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException! ");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException! ");
        }catch (Exception e) {
            System.out.println("Caught ! "+e.getClass());
        }finally{
            System.out.println("Iniside finally");
        }

        System.out.println("Hello World!");
    }
}
