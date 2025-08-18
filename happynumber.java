public class happynumber {
    
}
class Solution {
    public boolean isHappy(int n) {
        while(n>3){
            int sum =0;
            while(n!=0){
                sum=sum+((n%10)*(n%10));
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        else return false;
        
    }
}
