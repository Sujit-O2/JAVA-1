public class clm {
    
}
class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        return slove (n,dp);
        
    }

    private int slove(int n, int[] dp) {
    if(n==1)return 1;
    if(n==2)return 2; 
    int f1stp=slove(n-1,dp);
    int s2stp=slove(n-2,dp);
    return f1stp+s2stp;

    }
}
class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return slove (n,dp);
        
    }

    private int slove(int n, int[] dp) {
        if(dp[n]!=-1){
            return dp[n];
        }
    if(n<=0)return 0;
    if(n==1)return 1;
    if(n==2)return 2; 
    int f1stp=slove(n-1,dp);
    int s2stp=slove(n-2,dp);
    return dp[n]= f1stp+s2stp;

    }
}