import java.io.*;
import java.util.regex.*;

public class Stringmatch {

    public static void main(String[] args) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String ss=br.readLine();
       Pattern pp= Pattern.compile("[A-Za-z !,?._'@]+");
       Matcher mm=pp.matcher(ss);
       String a[]=new String[ss.length()];
       int i=0;
        while(mm.find()){
         a[i]=ss.substring(mm.start(),mm.end());
         i++;
        }
        System.out.println(i+1);
        for(int j=0;j<i;j++)
        System.out.println(a[j]);
    }
}
// import java.io.*;
// import java.util.regex.*;

// public class Stringmatch {

//     public static void main(String[] args) throws Exception {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String ss=br.readLine();
//        Pattern pp= Pattern.compile("[A-Za-z]+");
//        Matcher mm=pp.matcher(ss);
//        String a[]=new String[ss.length()];
//        int i=0;
//         while(mm.find()){
//          a[i]=ss.substring(mm.start(),mm.end());
//          i++;
//         }
//         System.out.println(i);
//         for(int j=0;j<i;j++)
//         System.out.println(a[j]);
//     }
// }