import java.lang.reflect.Array;
import java.util.Arrays;

public class ctc {
    public static void main(String[] args) {
        Solution ss=new Solution();
        int num[]={3,2,4};
        int target=6;
        int a[]=ss.twoSum(num,target);
        System.out.println(Arrays.toString(a));
    }
    
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int a[]={i,j};
                    return a;
                }
                
            }
        }
        return null;
        
    }
}
