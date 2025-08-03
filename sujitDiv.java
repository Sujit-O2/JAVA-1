public class sujitDiv {
    
    public static void main(String[] args) {
        Solution ss=new Solution();
        System.out.println(ss.divide(-2147483648,-2));
    }
    
}
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==0)return 0;
        if(dividend==Integer.MIN_VALUE&&divisor==-1)return Integer.MAX_VALUE;
        
        int neg= ((dividend<0)^(divisor<0))?-1:1;
        Long divid=Math.abs((long)dividend);
        Long divis=Math.abs((long)divisor);
        int result=0;
        while(divid>=divis){
            Long temp=divis;
            long mul=1;
            while(divid>=(temp<<1)){
                temp<<=1;
                mul<<=1;

            }
            divid-=temp;
            result+=mul;
            
        }
        return (neg==-1)?-result:result;
        

        
        
    }
}