public class Consucative 1 {
    
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int right=0;
        int count=0;
        int a=0;
        while(right<nums.length){

            
            if(nums[right]==0){
                left=right+1;
                a=0;
            }
            else{
                a++;
            }
            count=Math.max(count,a);
            right++;
        }
        return count;
        
    }
}