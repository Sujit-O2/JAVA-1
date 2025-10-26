class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempmax=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            int tempmin=Math.min(nums[i],Math.min(nums[i]*max,nums[i]*min));

 // as it is continous i need to change the max min as it must go with the flow lie this 
 max =tempmax;
 min=tempmin;
 // but result must the laggest of them all 
                result=Math.max(max,result);
        }
        return result;
       
    }
}
