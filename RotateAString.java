public class RotateAString {
    
}
class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            if(s.equals(goal)){
                return true;
            }
            s=s.substring(1,s.length())+s.charAt(0);

        }
        return false;
        
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
     if(s.length() != goal.length()) return false;
     return (s + s).contains(goal);   
    }
}