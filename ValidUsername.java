import java.io.*;
import java.util.regex.*;

public class ValidUsername {

    public static void main(String[] args) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the no of usernames::");
       int a=Integer.parseInt(br.readLine());
       Pattern pp=Pattern.compile("[a-zA-Z]\\w{7,29}");
       for(int i=0;i<a;i++){
        System.out.print("Enter "+(i+1)+" username:");
           String sa= br.readLine();
           Matcher mm=pp.matcher(sa);
           if(mm.matches()){
               System.out.println("Valid");
           }
           else{
               System.out.println("Invalid");
           }
       }
    }
}