import java.util.ArrayList;
import java.util.List;

public class summin {

    
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll=new ArrayList<>();
        int left=0;
        int right=0;
        while(left<=candidates.length){
            List<Integer> ll1=new ArrayList<>();
            int sum=candidates[left];
            while(sum<=target){
                sum+=right;
                if(sum<=target){
                    ll1.add(candidates[right]);
                }
                
            }
            if(sum-right==target){
                ll.add(ll1);
            }
            else{
                right++;
            }


        }



        return null;
        
    }
}
