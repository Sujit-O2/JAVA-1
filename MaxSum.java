import java.util.Arrays;

class Solution {
    // public int maxSubArray(int[] nums) {
    //     int dp[]=new int[nums.length];
    //     Arrays.fill(dp,Integer.MIN_VALUE);
    //     int maxsum=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         maxsum=Math.max(maxsum,Slove(nums,dp,i));

    //     }
    //      return maxsum;
        
    // }

    // private int Slove(int[] nums, int[] dp, int n) {

    //     if(n==0)return nums[0];
    //     if(dp[n]!=Integer.MIN_VALUE){
    //         return dp[n];
    //     }
    //     int sum=Math.max(nums[n],nums[n]+Slove(nums,dp,n-1));
    //     return dp[n]=sum;

    //      }
     public int maxSubArray(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        int maxSum=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
            maxSum=Math.max(maxSum,dp[i]);

        }
        return maxSum;
       
        
    }
}