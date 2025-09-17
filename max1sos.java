public class max1sos {
    
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;int right=0;
        int count =0;
        int a=0;
        while(right<nums.length){
            if(nums[right]==0){
                a++;
            }
            while(a>k){
                if(nums[left] == 0)a--;
                left++;

            }
            count=Math.max(count,right-left+1);

            right++;
        }

        return count;
    }
}