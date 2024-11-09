package javaFileRead;

import java.io.File;
import java.util.Scanner;
public class fileread {
   public static void main(String[] args) {
       try {
           File file = new File("C:/Users/HP/OneDrive/Desktop/today.txt");
           Scanner scanner= new Scanner(file);
           while(scanner.hasNext()){
               String id= scanner.next();
               String name= scanner.next();
               System.out.println("ID: "+id +"Name: "+name);
           }
       }catch(Exception e){
           System.out.println(e);
       }
   }
}
