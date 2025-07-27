public class lengthoflastword {
    
    public static void main(String[] args) {
        Solution ss=new Solution();
        ss.lengthOfLastWord("i Love My India");
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String su[]=s.split(" ");
        
        return (su.length!=0)?su[su.length-1].length():0;
    }
}