public class TrangleFixed {
    public int trangle(int a[][] ,int i,int j){
        if(i==a.length-1){
            return a[i][j];

        }
        int d=a[i][j]+trangle(a,i+1,j);
        int c=a[i][j]+trangle(a,i+1,j+1);
        return Math.min(d,c);
    }
    public int trangle(int a[][],int dp[][] ,int i,int j){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==a.length-1){
            return a[i][j];

        }
        int d=a[i][j]+trangle(a,dp,i+1,j);
        int c=a[i][j]+trangle(a,dp,i+1,j+1);
        return dp[i][j]=Math.min(d,c);
    }
    //  public int trangle(int a[][],int dp[][]){
    //     dp[0][0]=a[0][0];
    //     for(int i=0;i<a.length;i++){
            
            
    //     }
// }
}
