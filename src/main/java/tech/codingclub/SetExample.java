package tech.codingclub;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        System.out.println("This is Varri Yaswanth. Hello World running at "+ new Date().toString() +"sharp");

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("contact@codingclub.tech");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");
        emails.add("admin@google.com");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");
        emails.add("hr@tiktok.com");
        emails.add("admin@tiktok.com");
        emails.add("admin@tiktok.com");

        ArrayList<String>blackListEmails = new ArrayList<>();
        blackListEmails.add("admin@tiktok.com");
        blackListEmails.add("hr@tiktok.com");

        Set<String> uniqueEmails = new HashSet<>();
        uniqueEmails.add("hr@google.com");
        uniqueEmails.addAll(emails);

        Iterator<String>iterator = uniqueEmails.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterator showing :"+iterator.next());
        }
        for(String x:uniqueEmails){
            System.out.println("For loop showing emails: "+x);
        }
        System.out.println("Size of set: "+uniqueEmails.size());
        uniqueEmails.remove("admin@linkedin.com");
        uniqueEmails.removeAll(blackListEmails);
        for(String x:uniqueEmails){
            System.out.println("Sending emails to: "+x);
        }

        boolean codingClubEmailExist = uniqueEmails.contains("contact@codingclub.tech");
        System.out.println(codingClubEmailExist);

    }
}
