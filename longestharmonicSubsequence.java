import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class longestharmonicSubsequence {

    
}
class Solution {
    public int findLHS(int[] nums) {
        int maxcnt=0;
        int cnt=0;
       HashMap<Integer,Integer> has=new HashMap<>();
       for(int a:nums){
        has.put(a,has.getOrDefault(a,0)+1);
       }
       for(int a:has.keySet()){
        if(has.containsKey(a+1)){
            cnt=has.get(a)+has.get(a+1);
            maxcnt=Math.max(cnt,maxcnt);
        }
       }
        return maxcnt;
        
    }
}