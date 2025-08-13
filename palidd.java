public class palidd {
    
}
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        s=sb.toString()
        .toLowerCase();
        sb.setLength(0);
        sb.append(s).reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        else return false;
    }
}