import java.util.ArrayList;
import java.util.List;

public class reshapematrix {
    
}
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int a[][];
        if(c>r){
           a =new int[r][c/r];
        }
        else{
            a=new int[r][r/c];
        }
        
        List<Integer> l1=new ArrayList<>();
        for(int i[]:mat){
            for(int j:i){
                l1.add(j);
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=l1.getFirst();
                l1.removeFirst();
            }
        }

        return a;
        
    }
}