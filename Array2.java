import java.util.Arrays;

public class Array2 {
    
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         int []a;
        if(nums1.length<nums2.length){
           a=new int[nums1.length];
        }else a=new int[nums2.length];  
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        for(int i=0;i<nums1.length;i++){
            if(i<nums2.length){
                for(int j=i;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        a[k]=nums1[i];
                        k++;
                        break;

                    }
                }
            }
        }
        return a;
    }
}