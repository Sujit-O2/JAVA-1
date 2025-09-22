import java.util.HashMap;

public class MAxCountFreq {
    
}
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>aa=new HashMap<>();
        int maxCnt=0;
        int sum=0;
        for(int n1:nums){
            aa.put(n1,aa.getOrDefault(n1,0)+1);
            maxCnt=Math.max(maxCnt,aa.get(n1));

        }
        for(Integer i:aa.keySet()){
            if(maxCnt==aa.get(i)){
                sum+=maxCnt;

            }

        }
        return sum;
        
    }
}
