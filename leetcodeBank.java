public class leetcodeBank {
    
}
class Solution {
    public int totalMoney(int n) {
        int m=1;
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%7==0){
                m=1+(i/7);
            }
            sum=sum+m;
            m++;
            
        }
        return sum;
        
    }
}