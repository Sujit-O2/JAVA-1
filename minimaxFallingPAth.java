public class minimaxFallingPAth {
    public static void main(String[] args) {
        int a[][]=new int[5][6];
        int min=Integer.MAX_VALUE;
        for(int j=0;j<a[0].length;j++){
            min=Math.min(new minimaxFallingPAth().minPath(a,a.length-1,j),min);
        }
    }

    public int minPath(int a[][],int i,int j){
        if(j<0||j>a[0].length-1)return Integer.MAX_VALUE;
        if(0==i){
            return a[i][j];

        }
        int top=a[i][j]+minPath(a,i-1,j);
        int left=a[i][j]+minPath(a,i-1,j-1);
        int right=a[i][j]+minPath(a,i-1,j+1);
        return Math.min(top,Math.min(left,right));
        
    }
    public int minPath(int a[][],int i,int j,int dp[][]){
        
        if(j<0||j>a[0].length-1)return Integer.MAX_VALUE;
        if(0==i){
            return a[i][j];
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int top=a[i][j]+minPath(a,i-1,j,dp);
        int left=a[i][j]+minPath(a,i-1,j-1,dp);
        int right=a[i][j]+minPath(a,i-1,j+1,dp);
        return dp[i][j]= Math.min(top,Math.min(left,right));
        
    }

    public int minPath(int a[][]){
        int dp[][]=new int[a.length][a[0].length];
        for(int i=0;i<a[0].length;i++ ){
            dp[0][i]=a[0][i];
        }
        for(int i=1;i<a.length;i++){
            
        }
    }
}
