public class PrimeNoSetBinary {
    
}
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int total=0;
        for(int i=left;i<=right;i++){
            int b=Integer.bitCount(i);
            int j=2;
            int count=0;
            while(j*j<=b){
                if(b%j==0){
                    count++;
                }
                j++;
            }
            if(count==0){
                total++;
            }
        }
        return total;
        
    }
}