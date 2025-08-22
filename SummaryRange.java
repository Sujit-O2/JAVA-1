import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    
}
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        List<String> ll=new ArrayList<>();
        int left=0;int l1=0;
        String s;
        while(nums.length>left){
            i=left;
            if(nums[i]==nums[l1]){
                if(i==l1){
                    s=""+nums[i];
                }
                else{
                    s=nums[left]+"->"+nums[l1];
                }
                l1++;
            }
            i++;
        }
        return ll;
    }
}