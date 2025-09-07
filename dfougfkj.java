import java.util.HashSet;

public class dfougfkj {
    
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i< nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ss.add( nums1[i]);
                }
            }
        }
        int a[]=new int[ss.size()];
        int i=0;
        for(Integer s:ss){
            a[i]=s;
            i++;

        }
        return  a;
    }
}