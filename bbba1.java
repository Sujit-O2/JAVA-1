public class bbba1 {
public static void main(String[] args) {
    Solution ss=new Solution();
    System.out.println(ss.mySqrt(2147395600));
}
    
}
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int t=1;
        for (int i=1;i<=x;i++){
            if(i*i>x){
                return i-1;
            }
          
        }
        
        return t;
    }
}