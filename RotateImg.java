public class RotateImg {

    
}
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int temp=matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
}