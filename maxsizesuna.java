public class maxsizesuna {

    
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int count=Integer.MAX_VALUE;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            if(sum>=target){
                count=Math.min(count,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        if(count!=Integer.MAX_VALUE)
        return count;
        else return 0;
        
    }
}