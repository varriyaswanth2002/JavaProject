package tech.codingclub;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        System.out.println("This side is Varri Yaswanth");
        System.out.println("Test 7 running at "+ new Date().toString()+" sharp.");

        Map<String,String> countryToCapital = new HashMap<String,String>();
        //Add key value pairs to the map
        countryToCapital.put("India","Delhi");
        countryToCapital.put("China","Beijing");
        countryToCapital.put("Canada","Ottawa");
        if(countryToCapital.containsKey("India")) {
            System.out.println("Capital of India is : " + countryToCapital.get("India"));
        }
        if(countryToCapital.containsKey("Russia")) {
            System.out.println("Capital of India is : " + countryToCapital.get("Russia"));
        }
        else{
            System.out.println("Capital of Russia is not there in database");
        }

        //print all keys
        System.out.println("keys below");
        for(String key:countryToCapital.keySet()){
            System.out.print(key+" ");
        }
        System.out.println("Values below");
        for(String x:countryToCapital.values()){
            System.out.print(x+" ");
        }
        System.out.println();
        for(String key:countryToCapital.keySet()){
            System.out.println(key+" : "+countryToCapital.get(key));
        }
        countryToCapital.remove("Canada");
        System.out.println();
        System.out.println("After removing Canada:");
        for(String key:countryToCapital.keySet()){
            System.out.println(key+" : "+countryToCapital.get(key));
        }
        countryToCapital.clear();
        for(String key:countryToCapital.keySet()){
            System.out.println(key+" : "+countryToCapital.get(key));
        }
    }
}
