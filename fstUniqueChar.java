public class fstUniqueChar {
    
}
class Solution {
    public int firstUniqChar(String s) {
        int u=-1;
        int i=0;
        while (i<s.length()) {
            if(!s.substring(i+1).contains(s.charAt(i)+"")&&!s.substring(0,i).contains(s.charAt(i)+"")){
                u=i;
                return u;
            }
            i++;
            
        }
        return u;
        
    }
}