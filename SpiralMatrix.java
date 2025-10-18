import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return res;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // left -> right
            for (int j = left; j <= right; j++) res.add(matrix[top][j]);
            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;

            // right -> left (check remaining rows)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) res.add(matrix[bottom][j]);
                bottom--;
            }

            // bottom -> top (check remaining cols)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }
}
