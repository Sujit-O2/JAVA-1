public class MaxArea {
    
}
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxsqrt=0;
        int maxarea=0;


        for(int i=0;i<dimensions.length;i++){
            double a=(double)Math.sqrt(Math.pow(dimensions[i][0],2)+Math.pow(dimensions[i][1],2));
            if(maxsqrt<a){
                maxsqrt=a;
                maxarea=dimensions[i][0]*dimensions[i][1];

            }
        }
        return maxarea;
        
    }
}