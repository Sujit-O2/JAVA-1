public class islandGrid {

    
}
class Solution {
    public int islandPerimeter(int[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count +=4;
                     if(i+1<grid.length&&grid[i+1][j]==1){
                 count-=2;

                 }
                 if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                        count -= 2;
                    }
                }
              
            }
        }
        return count;
    }
}