import java.util.Arrays;

public class NextGreaterElement {
    
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int [nums1.length];
        Arrays.fill(a,-1);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    while (j<nums2.length) {
                        if(nums1[i]<nums2[j]){
                            a[i]=nums2[j]; 
                            break;
                        }
                        j++;
                        
                    }
                }

                
            }
        }
        return a;
        
    }
}