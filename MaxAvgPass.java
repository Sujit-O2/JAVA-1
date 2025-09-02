public class MaxAvgPass {
    
}
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        float maxValue=0;
        for(int k=0;k<classes.length;k++){
            float sum=0;
            sum=(float)(classes[k][0]+extraStudents)/(float)(classes[k][1]+extraStudents);
        for(int i=0;i<classes.length;i++){
            if(i!=k)
            sum=sum+((float)classes[i][0]/(float)classes[i][1]);
        }
        sum=sum/classes.length;
        maxValue=Math.max(sum,maxValue);

    }
    return maxValue;
        
    }
}