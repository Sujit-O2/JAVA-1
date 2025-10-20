import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        long prodLargest3 = 1L * nums[n-1] * nums[n-2] * nums[n-3];
        long prodWithNegs = 1L * nums[n-1] * nums[0] * nums[1];

        return (int) (prodLargest3 > prodWithNegs ? prodLargest3 : prodWithNegs);
    }
}
