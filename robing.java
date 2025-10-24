import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return slove(nums,nums.length-1,dp);
    }

    private int slove(int[] nums, int length, int[] dp) {
        if(length==0){
            return nums[length];

        }
        if(length==1){
            return Math.max(nums[length],nums[length-1]);
        }
        if(dp[length]!=-1){
            return dp[length];
        }
        return dp[length]=Math.max(nums[length]+slove(nums,length-2,dp),slove(nums,length-1,dp));

       
    
    }
}