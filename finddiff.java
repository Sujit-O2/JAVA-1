public class finddiff {
    
}
class Solution {
    public char findTheDifference(String s, String t) {
       int frq[]=new int[26];
       for(char c:s.toCharArray()){
            frq[c-'a']++;
       }
       for(char c:t.toCharArray()){
        frq[c-'a']--;
        if(frq[c-'a']<0){
            return c;
        }

       }
        
        return ' ';
        
    }
}