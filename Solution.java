import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        List<Integer> jag =new ArrayList<Integer>();
        for(String i : query){
            int count=0;
            for(String j : dictionary){
                
                if(i.length()==j.length()){
char [] s= i.toCharArray();
Arrays.sort(s);
String dis=s.toString();
System.out.println(dis);
                    char [] u= j.toCharArray();
                Arrays.sort(u);
        String mis=u.toString();
            System.out.println("---"+mis);
                if(dis==(mis)){
                    count++;
}
                }
            }
            jag.add(count);
        }
    
    return jag;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

    }}
