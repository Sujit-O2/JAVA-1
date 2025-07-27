public class pililing {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public String longestPalindrome(String s) {
        String SubStr="";
        String pali="";
        int Maxcoun=0;
        int left=0;
        
        for(int i=0;i<s.length()+1;i++){
            SubStr+=s.charAt(i);
            StringBuffer ss=new StringBuffer(SubStr);
            if(SubStr.equals(ss.reverse().toString())){
                if(SubStr.length()>Maxcoun){
                    Maxcoun=SubStr.length();
                    pali=SubStr;
                }
                left++;
                SubStr=SubStr.substring(left);
            }

                }
        return pali;

        
    }
}
