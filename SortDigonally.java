import java.util.ArrayList;
import java.util.Collections;
public class SortDigonally {

    
}


 class Solution {
    public int[][] diagonalSort(int[][] grid) {
        int n = grid.length;
        
        // Handle bottom-left triangle (excluding main diagonal)
        for (int startRow = 1; startRow < n; startRow++) { // Start from row 1
            // Get elements of current diagonal
            ArrayList<Integer> diagonal = new ArrayList<>();
            int row = startRow, col = 0;
            while (row < n && col < n) {
                diagonal.add(grid[row][col]);
                row++;
                col++;
            }
            
            // Sort in non-increasing order (descending)
            Collections.sort(diagonal, Collections.reverseOrder());
            
            // Put back sorted elements
            row = startRow;
            col = 0;
            int i = 0;
            while (row < n && col < n) {
                grid[row][col] = diagonal.get(i);
                row++;
                col++;
                i++;
            }
        }
        
        // Handle top-right triangle
        for (int startCol = 1; startCol < n; startCol++) {
            // Get elements of current diagonal
            ArrayList<Integer> diagonal = new ArrayList<>();
            int row = 0, col = startCol;
            while (row < n && col < n) {
                diagonal.add(grid[row][col]);
                row++;
                col++;
            }
            
            // Sort in non-decreasing order (ascending)
            Collections.sort(diagonal);
            
            // Put back sorted elements
            row = 0;
            col = startCol;
            int i = 0;
            while (row < n && col < n) {
                grid[row][col] = diagonal.get(i);
                row++;
                col++;
                i++;
            }
        }
        
        return grid;
    }
}