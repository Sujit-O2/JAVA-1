import java.util.Arrays;

public class houseroberii {
    
}
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int a=slove(nums,dp,nums.length-1,1);
                Arrays.fill(dp,-1);
        int b=slove(nums,dp,nums.length-2,0);

        return Math.max(a,b);
        
    }

    private int slove(int[] nums, int[] dp, int length, int b) {
        if(length==b){
            return nums[length];

        }
       
        if(length==b+1){
            return Math.max(nums[length],nums[length-1]);
        }
       
        if(dp[length]!=-1){
            return dp[length];
        }
        return dp[length]=Math.max(nums[length]+slove(nums,dp,length-2,b),slove(nums,dp,length-1,b));
       
    
    }
}