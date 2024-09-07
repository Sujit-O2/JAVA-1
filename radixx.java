import java.util.*;
import java.util.regex.*;

public class radixx {
 
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
  String aa=se.nextLine();
        Pattern pp= Pattern.compile("[A-Z]+");
    Matcher mm=pp.matcher(aa);
    if(mm.matches()){
        System.out.println("Valide");
    }
    else{
        System.out.println("InValid");
    }
    se.close();
    
    }
}