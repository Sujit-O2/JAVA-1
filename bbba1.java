public class bbba1 {
public static void main(String[] args) {
    Solution ss=new Solution();
    System.out.println(ss.mySqrt(4));
}
    
}
class Solution {
    public int mySqrt(int x) {
        int i=1;
        int j=x/2;
        int mid=0;
        int ans=0;
        if(x<2) return x;
        while(i<=j){
            mid=i+(j-i)/2;
            
            if(mid<=x/mid){
               ans=mid; 
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        
        return ans;
    }
}