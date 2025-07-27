public class jjass {
    public static void main(String[] args) {
        int  a[]={2,3,5,6};
        Solution ss=new Solution();
        System.out.println( ss.searchInsert(a,1));
    }
    
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int tar=0;
        
        while(tar<nums.length){
            if(target>nums[tar]){
                tar++;
            }
            else{
                
                return tar;
        }

        }
        return tar;
        
    }
}