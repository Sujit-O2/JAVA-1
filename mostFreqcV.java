import java.util.HashMap;

public class mostFreqcV {
    
}
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>vs=new HashMap<>();
        HashMap<Character,Integer>cs=new HashMap<>();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vs.put(c,vs.getOrDefault(c,0)+1);
            }
            else{
                cs.put(c,cs.getOrDefault(c,0)+1);

            }

        }
        int maxcon=0;
        int maxvow=0;
        for(Character c:vs.keySet()){
            maxvow=Math.max(maxvow,vs.get(c));
        }
        for(Character c:cs.keySet()){
            maxcon=Math.max(maxcon,cs.get(c));
        }
        return maxcon+maxvow;
    }
}