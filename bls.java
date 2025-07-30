import java.util.Arrays;

public class bls {
    
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a[]=nums1;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        
    

        
    }
}