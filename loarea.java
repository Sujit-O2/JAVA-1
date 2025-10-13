public class loarea {
    
}
class Solution {
    public double largestTriangleArea(int[][] points) {
        int height=0;
        int length=0;
        for(int i=0;i<points.length;i++){
            height=Math.max(points[i][0],height);
            length=Math.max(points[i][1],height);
        }
        
    
    return (double)(.5*length*height);
    }
}