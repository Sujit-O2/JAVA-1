public class DigonalTraves {
    
}
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int o=m*n;
        int mat2[]=new int[o];
        int a=0,b=0;
        for(int i=0;i<o;i++){
            mat2[i]=mat[a][b];
            if((a+b)%2==0){
                if(b==n-1){
                    a++;
                }
                else if(a==0){
                    b++;

                }
                else{
                    a--;
                    b++;
                }
                
            }
            else{
                if(a==m-1){
                    b++;
                }
                else if(b==0){
                    a++;
                }
                else{
                    a++;b--;
                }
            }
        }
        
        return mat2;
    }
}