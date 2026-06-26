package tech.codingclub;

import java.util.Date;

public class SingletonandException {
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth");
        System.out.println("Test 6 is running at" + new Date().toString()+" sharp");

        SingletonExample.main(null);
        ExceptionExample.main(null);
    }
}
