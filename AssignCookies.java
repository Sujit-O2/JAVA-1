import java.util.Arrays;

public class AssignCookies {
    
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int l1=0;int l2=0;
        while(l1<s.length&&l2<g.length){
            if(g[l1]<=s[l2]){
                    count++;
                    l1++;
                    l2++;
                    
        }
        else{
            l2++;

        }
        
        }
        return count;
    }
}