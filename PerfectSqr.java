public class PerfectSqr {
    
}
class Solution {
    public boolean isPerfectSquare(int num) {
        if( num<=1) return true;
        int left=2;
        int right=num/2;
       while(left<=right){
        int mid=left+(right-left)/2;
        if(mid*mid==num){
            return true;
        }
        else if(mid*mid<num){
            left= mid+1;
        }
        else{
            right=mid-1;
        }

       }
        return false;
        
        
    }
}