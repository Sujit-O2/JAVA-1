public class game69 {
    
}
class Solution {
    public int maximum69Number (int num) {
        String s=num+"";
        int maxv=num;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                StringBuilder bb=new StringBuilder(s);
                bb.replace(i,i+1,"9");
                maxv=Math.max(maxv,Integer.parseInt(bb.toString()));
            }

        }
        return maxv;
        
    }
}
