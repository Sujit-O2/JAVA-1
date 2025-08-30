public class Jumpgame {
    
}
class Solution {
    public boolean canJump(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                return true;

            }
            if(nums[i]==0){
                return false;
            }
            int max=0;
            for(int j=i;j<=nums[i];j++){
                
                max=Math.max(max,nums[j]);
            }
            if(max>1){
                i=max-1;

            }
        }
        return true;
        
    }
}