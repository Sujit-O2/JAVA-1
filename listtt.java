import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listtt {
    public static void main(String[] args) {
        int a[]={-1,0,1,2,-1,-4};
        Solution ss=new Solution();

        List ll=ss.threeSum(a);
    
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        Arrays.sort(nums);
        int right=0;
        int left=nums.length-1;
        int current=1;
       while(left>right){
            
                if(nums[right]+nums[left]+nums[current]==0){
                    ArrayList<Integer> aa=new ArrayList<>();
                    aa.add(nums[right]);
                    aa.add(nums[current]);
                    aa.add(nums[left]);
                    ll.add(aa);
                    


                }
                current++;
            
        }
        System.out.println(ll);
    return ll;
    }
}

