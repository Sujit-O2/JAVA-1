import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Uniqu {
    
}
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String alp[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       Set<String> ss=new HashSet<>();
        for(String word: words){
            StringBuilder bb=new StringBuilder();
            for(char c: word.toCharArray()){
                
                int a=c-'a';
                bb.append(alp[a]);

            }
            ss.add(bb.toString());

        }
        return ss.size();
        
    }
}