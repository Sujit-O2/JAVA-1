import java.util.*;
public class thow_GG {
public static void main(String[] args){
    System.out.print("enter the positive number:");
Scanner se=new Scanner(System.in);
int a=se.nextInt();
 se.close();
    try{
        if(a>0){
          System.out.println("goot night");
        }
        else{
    throw new Exception("donot enter -ve value");}}catch(Exception   e){
        System.out.println(e);
    }
   
}
}