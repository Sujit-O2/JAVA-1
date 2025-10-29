public class Colouring {
    
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        if(sr!=0&&sr!=m-1){
            
        }
        for(int i=0;i<m-2;i++){
            for(int j=i;j<n-2;j++){
                if(image[i][j]>0){
                    image[i][j]=color;
                    
                }

            }
        }
        
    }
}