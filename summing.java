import java.util.HashSet;

public class summing {
    public static void main(String[] args) {
       int a[]= {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
       Solution ss=new Solution();
       System.out.println(ss.maximumUniqueSubarray(a));
    }
}
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> ss=new HashSet<>();
        for(int a:nums){
            ss.add(a);

        }
        int sum=0;
        for(int c: ss){
            sum+=c;

        }
        return sum;
        
    }
}
