public class pivlotind {
    
}
class Solution {
    public int pivotIndex(int[] nums) {
        int pivotin=0;
        int leftsum=0;
        int rightsum=0;
        for(int j=0;j<nums.length;j++){
            pivotin=j;
            leftsum=0;rightsum=0;
        for(int i=0;i<pivotin;i++){
            leftsum+=nums[i];

        }
        for(int i=pivotin+1;i<nums.length;i++){
            rightsum+=nums[i];

        }
        if(leftsum==rightsum){
            return pivotin;
        }
    }
        return -1;
        
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int left=0;
        for (int num:nums){
            total+=num;
        }
        for (int i=0;i<nums.length;i++){
            if(left==total-left-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}