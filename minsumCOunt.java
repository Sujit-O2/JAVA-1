public class minsumCOunt {

    int MinCost(int a[][], int top,int left ){
        if(top==0&&left==0){
            return a[top][left];
        }
        if(top<0||left<0){
            return Integer.MAX_VALUE;
        }
        int a2=a[top][left]+MinCost(a,top-1,left);
        int b2=a[top][left]+MinCost(a,top,left-1);
        return Math.min(a2,b2);
        
    }    
     int MinCost(int a[][], int top,int left,int dp[][] ){
        if(top==0&&left==0){
            return a[top][left];
        }
        if(top<0||left<0){
            return Integer.MAX_VALUE;
        }
        if(dp[top][left]!=-1)return dp[top][left];
        int a2=a[top][left]+MinCost(a,top-1,left,dp);
        int b2=a[top][left]+MinCost(a,top,left-1,dp);
        return dp[top][left] =Math.min(a2,b2);
        
    }   
     int MinCost(int a[][] ){
    int dp[][]=new int[a.length+1][a[0].length+1];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            if(i==0&&j==0) dp[0][0]=a[0][0];
            else{
                int down=dp[i-1][j]+a[i][j];
                int left=dp[i][j-1]+a[i][j];
                dp[i][j]=Math.min(down,left);

            }
        }
        
    }
    return dp[a.length-1][a[0].length-1];



     }
     
}