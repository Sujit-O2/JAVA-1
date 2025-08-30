public class nOoFpATHS {

    int path(int[][]a,int i,int j){


        if(i==0&&j==0)return 1;
        if(i<0||j<0)return 0;
        if(a[i][j]!=-1){
            return a[i][j];
        }
       int up= path(a,i-1,j);
       int left =path(a,i,j-1);
       return a[i][j]=up+left;
    }
    int path(int i,int j){
        int dp[][]=new int[i+1][j+1];
        dp[0][0]=1;
        for(int i1=0;i1<=i;i1++){
            for(int j1=0;j1<=j;j1++){
                if(i1==0&&j1==0) continue;
                else{
                    int up=0,down=0;
                    if(i1>0)  up=dp[i1-1][j1];
                    if(j1>0) down=dp[i1][j1-1];
                    dp[i1][j1]=up+down;
                }

            }

        }
        return dp[i][j];
    }

}