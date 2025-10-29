public class markArrayElement {
    
}
class Solution {
    public int countValidSelections(int[] nums) {
        int sum=0;
        int left=0;
        int count=0;
        for(int num: nums){
            sum=sum+num;

        }
        for(int i=0;i<nums.length;i++){
            left+=nums[i];
            if(nums[i]==0){
                if(left==sum-left){
                    count+=2;
                }
                else if(Math.abs(left-Math.abs(left-sum))==1){
                    count +=1;
                }
            }
        }

return count;
        }
        
        
    }