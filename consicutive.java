import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class consicutive {
    
}
class Solution {
    public List<String> removeAnagrams(String[] words) {
        String  prev="";
        List<String> ss=new ArrayList<>();
        for(String word:words){
            char c[]=word.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!s.equals(prev)){
                ss.add(word);
                prev=s;

            }

        }
        return ss;
    }
}