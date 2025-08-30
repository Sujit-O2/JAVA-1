public class ugluNo {
    public static void main(String[] args) {
        System.out.println(new Solution().nthUglyNumber(10));
    }
    
}
class Solution {
    public int nthUglyNumber(int n) {
        if(n<=0)return 0;
        int i=0;
        int num=1;
        int num1=0;
        while(i<n){
            num1++;
            num=num1;
            while(num%2==0)num/=2;
            while(num%3==0)num/=3;
            while(num%5==0)num/=5;
        if(num==1){
            i++;
        }
        
        

        }

        return num1;
    }
}