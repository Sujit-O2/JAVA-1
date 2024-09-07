import java.io.*;
import java.util.regex.*;

public class redexiPattern {
 
    public static void main(String[] args)throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(bf.readLine());
        for(int j=0;j<i;j++){
  String aa=bf.readLine();
  try{
        Pattern pp= Pattern.compile(aa);
         System.out.println("Valid");
  }
       catch(Exception e){
            System.out.println("Invalid");
    }}
       }
    
}