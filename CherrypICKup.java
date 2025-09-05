import java.util.Arrays;

public class CherrypICKup {
public static void main(String[] args) {
        int grid[][] = {
            {3, 1, 1},
            {2, 5, 1},
            {1, 5, 5},
            {2, 1, 1}
        };
         int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][n];
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            Arrays.fill(dp[i][j], -1); 
    }
}        CherrypICKup ss=new CherrypICKup();
        System.out.println(ss.check(0, 0, n - 1, grid, dp));

         

    }
int check(int i,int j,int j1,int aa[][]){
    if(j<0||j>=aa[0].length||j1<0||j1>=aa[0].length){
        return Integer.MIN_VALUE;
    }
    if(i==aa.length-1){
        if(j!=j1){
            return aa[i][j]+aa[i][j1];
        }
        else{
            return aa[i][j];
        }
    }
    int max=0;
    for(int a=-1;a<=1;a++){
        for(int b=-1;b<=1;b++){
            if(j1!=j) max=Math.max(aa[i][j]+aa[i][j1]+check(i+1,j+a,j1+b,aa),max);
            else max=Math.max(aa[i][j]+check(i+1,j+a,j1+b,aa),max);
        }
    }
    return max;
}
int check(int i,int j,int j1,int aa[][] ,int dp[][][]){
    if(j<0||j>=aa[0].length||j1<0||j1>=aa[0].length){
        return Integer.MIN_VALUE;
    }
    if(dp[i][j][j1]!=-1){
        return dp[i][j][j1];
    }
    if(i==aa.length-1){
        if(j!=j1){
            return dp[i][j][j1]= aa[i][j]+aa[i][j1];
        }
        else{
            return dp[i][j][j1]= aa[i][j];
        }
    }
    int max=0;
    for(int a=-1;a<=1;a++){
        for(int b=-1;b<=1;b++){
            if(j1!=j) max=Math.max(aa[i][j]+aa[i][j1]+check(i+1,j+a,j1+b,aa ,dp),max);
            else max=Math.max(aa[i][j]+check(i+1,j+a,j1+b,aa,dp),max);
        }
    }
    return dp[i][j][j1] =max;
}

}