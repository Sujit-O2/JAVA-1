import java.io.*;
import java.util.*;

public class Word_separation {

    public static void main(String[] args) {
        
       Scanner Sc=new Scanner(System.in);
       String ss=Sc.nextLine();
       String a[]=ss.split("[^A-Za-z]+");
       System.out.println(a.length);
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
   }
}
