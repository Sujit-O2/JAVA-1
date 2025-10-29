import java.util.Arrays;

public class largeSmall {
    
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ac=letters[0];
        
        for(char c:letters){
            if(target<c){
                ac=c;
                break;
            }
        }
        return ac;
        
    }
}