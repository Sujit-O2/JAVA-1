public class longstkk {
    public static void main(String[] args) {
        Solution ss=new Solution();
        String str[]={"flower","flow","flight"};
       String s= ss.longestCommonPrefix(str);
       System.out.println(s);

        
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        String g="";
        int i=0;
        if (strs.length==0) return "";
       while(true){
        if(strs[0].length()>i)
        g=g+strs[0].charAt(i);
        for(String a:strs){
            
            if(a.length()>i){
            if(g.equals(a.substring(0,i+1))){

            }
            else{
                return s;
            }
        }
        else{
            return s;
        }
        }
        i++;
        s=g;
       }

    }
}
