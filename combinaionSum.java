import java.util.ArrayList;
import java.util.List;

public class combinaionSum {
    
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll=new ArrayList<>();
         combine(ll, candidates,target,new ArrayList<Integer>(), candidates.length-1);
         return ll;
        
    }

    private void combine(List<List<Integer>> ll,ArrayList<Integer> l2, int[] candidates, int target ,int ind) {
        
        if(target<0){
            return;
        }
        if(target==0){
            ll.addFirst(l2);
        }
        for(int i=ind;i<candidates.length;i++){
            l2.add(candidates[i]);
            combine(ll,l2,candidates,target-candidates[i],i);
            l2.remove(l2.size()-1);

        }
        
        
        
        
    
    
    }
}