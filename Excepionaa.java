import java.io.*;
import java.util.*;

public class Excepionaa {

    public static void main(String[] args) {
       Scanner se=new Scanner(System.in);
       try{
       int a=se.nextInt();
       int b=se.nextInt();
       System.out.println(a/b);
    }
    catch(InputMismatchException e){
       
        System.out.println("java.util.InputMismatchException");
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}