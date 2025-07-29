public class steps {
    
}
class Solution {
    public int climbStairs(int n) {
//  fir p1 and p2 the one path for goto the 2 as loop staet we will get 2 ways 1+1,2
// p1+p2; like wise for 3 crr+p2 as it ia odd 
        int prev2=1;
        int prev1=1;
        int curr;
        for(int i=2;i<n;i++){
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;

        }
        return prev1;
    }}
