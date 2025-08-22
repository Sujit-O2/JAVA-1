import java.util.Arrays;

public class ValidAnagrm {
    
}
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] aa=s.toCharArray();
        Arrays.sort(aa);
        
        char []bb=t.toCharArray();
        Arrays.sort(bb);
        
        
        return Arrays.equals(aa,bb);
    
        
    }
}
