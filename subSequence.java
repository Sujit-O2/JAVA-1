public class subSequence {
    
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()==0)return true;
        while(j<t.length()){
            if(t.charAt(j)==s.charAt(i)){
                i++;
                
                if(i==s.length()){
                    return true;
                }
                j++;
            }
            else{
                j++;
            }
        }
        return false;
        
        
    }
}