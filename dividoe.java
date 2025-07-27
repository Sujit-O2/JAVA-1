public class dividoe {
   public static void main(String[] args) {
     Solution ss=new Solution();
    int a=ss.reverse(-2147483648);
    
   }
}
class Solution {
    public int reverse(int x) {
       int d=0;
       int a=0;
        while(x!=0){
            d=x%10;
            x=x/10;
if(a>Integer.MAX_VALUE/10||a==Integer.MAX_VALUE/10&&d>7){
    return 0;
}
if(a<Integer.MIN_VALUE/10|| a==Integer.MIN_VALUE/10&&d<-8){
    return 0;
}
a=a*10+d;

        }
        return a;
        
    }

}
