import java.util.Arrays;

public class TargetSum {
    
}
// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
        
//         return slove(nums,nums.length,0,0,target);
        
//     }

//     private int slove(int[] nums, int length, int sum, int a, int target) {
//         if(a==length){
//             return (sum==target)?1:0;
//         }
//         int add=slove(nums,length,sum+nums[a],a+1,target);
//         int sub=slove(nums,length,sum-nums[a],a+1,target);

//         return add+sub;

//         }
// }
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;

        for (int num : nums) totalSum += num;
        int dp[][]=new int [nums.length][2*totalSum+1];

        for (int[] row : dp) Arrays.fill(row, -1);
        return slove(nums,nums.length,0,0,target,dp,totalSum);
        
    }

    private int slove(int[] nums, int length, int sum, int a, int target,int[][] dp,int s1) {
        if(a==length){
            return (sum==target)?1:0;
        }
        if(dp[a][sum+s1]!=-1){
            return dp[a][sum+s1];
        }
        int add=slove(nums,length,sum+nums[a],a+1,target,dp,s1);
        int sub=slove(nums,length,sum-nums[a],a+1,target,dp,s1);
        
        return dp[a][sum+s1]=add+sub;

        }
}