import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * prr
 */
public class prr {

    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("a*b");
        //only 'aa'
        // s=new StringBuilder("aa");
        //one or more 'a' then 0 or more 'b'
        // s=new StringBuilder("a+b*");
        //one 'a'
        // s=new StringBuilder("a{1}");
        //ONE or more 'a'
        // s=new StringBuilder("a{1,}");
        //2 to 5 'a'
        // s=new StringBuilder("a{2,5}");
        //0 to 3 'a'
        // s=new StringBuilder("a{0,3}");
        //a or b
        // s=new StringBuilder("a|b");
         //ab 0 imes or more times
        // s=new StringBuilder("(ab)*");
        // digits [0-9]
        // s=new StringBuilder("\\d");
        // digits [1-9]
        // s=new StringBuilder("\\D");
        //white space
        // s=new StringBuilder("\\s");
        //non-white space
        // s=new StringBuilder("\\S");
        //any character
        // s=new StringBuilder("(\\w)+");
        //ph no
        // s=new StringBuilder("\\d{10}");
        //mali 
        // s=new StringBuilder("^\\w+@\\w{5,7}\\.[a-zA-z]{2,}$");
        s=new StringBuilder("(\\w|@|\\$)+");

        Pattern pp=Pattern.compile(s.toString());
        // Matcher m=pp.matcher("aaaaaaaab");
        // Matcher m=pp.matcher("aa"); 
        Matcher m=pp.matcher("aygy@$hbuyg");
       

        boolean b=m.matches();
        System.out.print(b);
    }
}