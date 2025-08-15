public class powOfFour {
    
}
class Solution {
    // public boolean isPowerOfFour(int n) {
    //     while(n%4==0){

    //         n=n/4;
    //     }
    //     return n==1;
        
    // }

    // public boolean isPowerOfFour(int n) {
    //     if(n==0) return false;
    //     int x=Math.abs(n);
    //     double va=Math.log(x)/Math.log(4);
    //     return va==Math.floor(va);
        
    // }
    public boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        return (n&(n-1))==0&&((n-1)%3==0);
    }


}