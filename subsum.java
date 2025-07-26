import java.util.HashSet;

public class subsum {
  public static void main(String[] args) {
      Solution ss=new Solution();
    int []as={-10,-100,-10};
    int a=ss.maxSum(as);
    System.out.println(a);
  }

    
}
class Solution {
    public int maxSum(int[] nums) {
        int max=0;
        int min=-100;
        int count=0;
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ss.add(nums[i]);

        }
        for(int a: ss){

            if(a>=0){
            count=1;
            max=a+max;
            }
            else{
                if(min<a){
                    min=a;
                }

            }
        }
        
        if(count==0){
            return min;
        }
        return max;
    }
}
