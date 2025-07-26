import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class nums {

    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        Solution ss=new Solution();
       int a= ss.strStr("sadbutsad","sad");
       System.out.println(a);
        
    }

}
    class Solution {
    public int removeDuplicates(int[] nums) {

    int j=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=nums[j]){
            j++;
            nums[j]=nums[i];
            

        }
    }
    return j+1;
    }
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int s: nums){
            if(s!=val){
            System.out.println(s);
                nums[i]=s;
                i++;
            }
        }
        
        
        return i+1;
        }
       
    public int strStr(String haystack, String needle) {
        int a= haystack.indexOf(needle);
        return a;
        
    }
}
        
    

