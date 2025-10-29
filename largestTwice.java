public class largestTwice {
    
}
class Solution {
    public int dominantIndex(int[] nums) {
        int lagge=0;
        for(int i=0;i<nums.length;i++){
            if(nums[lagge]<nums[i]){
                lagge=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=lagge)
            if(nums[i]+nums[i]>nums[lagge]){
                return -1;
            }
        }
        return lagge;

        
    }
}