public class convinient {
    
}
class Solution {
    public int[] constructRectangle(int area) {
        int right = (int) Math.sqrt(area);
        while (area % right != 0) {
            right--;
        }
        int left = area / right;
        return new int[]{left, right};
    }
}
