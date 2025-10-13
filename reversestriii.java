public class reversestriii {
    
}
class Solution {
    public String reverseWords(String s) {
        
        String[] bb=s.split(" ");
       
        for(int i=0;i<bb.length;i++){
            StringBuilder b1=new StringBuilder(bb[i]);
            b1.reverse();
            bb[i]=b1.toString();
        }
        return String.join(" ",bb);
    }
}