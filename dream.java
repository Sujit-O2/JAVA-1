import java.util.Arrays;

public class dream {
    
}
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int a[]=new int [nums.length];
        Arrays.fill(a,-1);
        int sum=0;
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
            }
            a[k]=sum/(2*k+1);
            for(int i=2*k+1;i<nums.length;i++){
                sum+=nums[i];
                sum-=nums[i-(2*k+1)];
                a[i-k]=sum/(2*k+1);
            }
        return a;
    }
}