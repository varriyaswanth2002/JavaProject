package tech.codingclub;

import java.util.Date;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth");
        System.out.println("Test 6 is running at" + new Date().toString()+" sharp");

        Random random = new Random();
        int randomIntValue = random.nextInt(100);
        System.out.println("randomIntValue: 0 - 99: " + randomIntValue);

        //50 99
        int randomIntValueInRange =50 + random.nextInt(50);//0 - 49
        System.out.println("randomIntValueInRange: 50 - 99: " + randomIntValueInRange);

        String s1 = "HelloWorld";
        System.out.println("Printing String: "+s1);
        //string pool
        //if s1 and s3 are apple then both point to same in string pool
        s1 = s1+"!";
        System.out.println("Printing Modified String: "+s1);

        System.out.println("Current length: "+s1.length());
        System.out.println(" string(5,end): "+s1.substring(5));
        System.out.println(" string(5,7): "+s1.substring(5,7));

        System.out.println("UC :"+s1.toUpperCase());
        System.out.println("LC :"+s1.toLowerCase());

        int h =s1.indexOf('W');
        System.out.println("Index of W :"+h);

        char g = s1.charAt(6);
        System.out.println("Char at 6th index:"+g);

        String s2 ="abc";
        String s3 ="abf";
        //s3>s2 -> negative
//        s3<s2 -> positive
//        s3 = s2 -> zer0
        System.out.println(s2.compareTo(s3));

        Date date = new Date();
        long previousEpochTime = date.getTime();

        for(int i=0;i<1000000;i++){

        }
        long timeNow = new Date().getTime();
        long diff = (timeNow - previousEpochTime);
        System.out.println(diff+" milliseconds to run 10^6 on my machine");

        System.out.println(new Date().toString());

        Date dateFromEpoch = new Date(1781961934125L);
        System.out.println(dateFromEpoch.toString());

        String str = "welcometojava";
        int n = 3;
        String max = str.substring(0,n);
        String min = str.substring(0,n);
        for(int startIndex=0;startIndex<str.length()-2;startIndex++){
            String word = str.substring(startIndex,startIndex+n);
            if(min.compareTo(word)>0){
                min = word;
            }
            if(max.compareTo(word)<0){
                max = word;
            }
        }
        System.out.println(max);
    }
}
