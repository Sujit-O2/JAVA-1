public class Toeplitz {
    
}
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean das=true;
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}