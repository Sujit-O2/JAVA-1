public class nonZero {
    
}
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i =0;i<n;i++){
            int b=n-i;
            if(isZero(i)&&isZero(b)){
                return new int[]{i,b};
            }
        }
        return new int[]{};
        
    }
    boolean isZero(int n){
        while(n!=0){
            if(n%10==0)return false;
            else{
                n=n/10;
            }
            
        }
        return true;
    }
    
}
