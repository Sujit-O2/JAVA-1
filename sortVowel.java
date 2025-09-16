import java.util.ArrayList;
import java.util.Collections;

public class sortVowel {
    
}
class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> cc=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            cc.add(c);
            }
        }    
        Collections.sort(cc);
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                sb.append(cc.getFirst());
                cc.removeFirst();
            }
            else{
                sb.append(c);
            }

        }
        return sb.toString();
    }
}