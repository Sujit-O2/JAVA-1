import java.util.Arrays;

public class difficultjob {
    
}
// class Solution {
//     public int minDifficulty(int[] jobDifficulty, int d) {
//         int n=jobDifficulty.length;
//         if(n<d){
//             return -1;
//         }
//       return slove(jobDifficulty,n,d,0);
        
        
//     }

//     private int slove(int[] jobDifficulty, int n, int d, int i) {
//         if(d==1){
//             int maxd=jobDifficulty[i];
//             for(int j=i;j<n;j++){
//                 maxd=Math.max(maxd,jobDifficulty[j]);
//             }
//             return maxd;

//         }
//         int maxd=jobDifficulty[i];
//         int maxresult=Integer.MAX_VALUE;
//         for(int j=i;j<=n-d;j++){
//             maxd=Math.max(maxd,jobDifficulty[j]);
//             int result=maxd+slove(jobDifficulty,n,d-1,j+1);
//             maxresult=Math.min(maxresult,result);



//         }
//         return maxresult;
        
//     }
// } 
class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        int dp[][]=new int [n][d];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
         
        if(n<d){
            return -1;
        }
      return slove(jobDifficulty,n,d,0,dp);

    }

    private int slove(int[] jobDifficulty, int n, int d, int i, int[][] dp) {
        if(dp[i][d]!=-1){
            return dp[i][d];
        }
        if(d==1){
            int maxd=jobDifficulty[i];
            for(int a=0;a<n;a++){
                maxd=Math.max(maxd,jobDifficulty[a]);
            }
            return maxd;
        }
        int maxd=jobDifficulty[i];
        int maxresult=Integer.MAX_VALUE;
        for(int j=i;j<=n-d;j++){
            maxd=Math.max(maxd,jobDifficulty[j]);
            int result=maxd+slove(jobDifficulty,n,d-1,j+1,dp);
            maxresult=Math.min(maxresult,result);
        }
        return dp[i][d]=maxresult;
    }
}