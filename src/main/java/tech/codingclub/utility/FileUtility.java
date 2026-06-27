package tech.codingclub.utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileUtility {
    public static boolean createFile(String fileNameWithPath){
        File file=new File(fileNameWithPath);
        boolean fileCreated=false;
        try{
            fileCreated=file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        return fileCreated;
    }

    public static ArrayList<String> readFileAsList(String fileName) {
        Scanner scanner=null;
        ArrayList<String> strings=new ArrayList<String>();
        try{
            File file=new File(fileName);
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                strings.add(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        return strings;
    }

    public static boolean writeToFile(String fileNameWithPath,String content){
        try{
            FileWriter fileWriter=new FileWriter(fileNameWithPath);
            fileWriter.append(content);
            fileWriter.close();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public static boolean appendToFile(String fileName,String content){
        try{
            FileWriter fileWriter=new FileWriter(fileName,true);
            fileWriter.append("\n");
            fileWriter.append(content);
            fileWriter.close();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("This is yaswanth varri");
        System.out.println("FileUtility running at " + new Date().toString() + " sharp.");
        String nameOfNewFile="C:\\Users\\varri\\IdeaProjects\\javaBasics\\data\\practice\\file\\"+"createfile.txt";
        //Boolean created=createFile(nameOfNewFile);
        //System.out.println("File created: "+created);

        ArrayList<String> stringArrayList=readFileAsList(nameOfNewFile);
        for(String row:stringArrayList){
            System.out.println("Line: "+row);
        }
        System.out.println("no.of lines in file: "+stringArrayList.size());

        String nameOfWriteFile="C:\\Users\\varri\\IdeaProjects\\javaBasics\\data\\practice\\file\\"+"write-file.txt";
        boolean wroteToFile=writeToFile(nameOfWriteFile,"This file is genereated on yaswanth system automatically");
        System.out.println(wroteToFile);

        //append
        for(int i=1;i<=100;i++){
            String data=i+"";
            appendToFile(nameOfWriteFile,data);
        }
        System.out.println("Appended file length "+readFileAsList(nameOfWriteFile).size());

    }



}
