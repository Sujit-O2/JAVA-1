public class smmm {
    public static void main(String[] args) {
        System.out.println(new Solution().smallestNumber(10));
    }
    
}
class Solution {
    public int smallestNumber(int n) {
        StringBuilder bit=new StringBuilder();
        while(n>0){
            bit.append(n%2);
            n/=2;
        }
        
      
        int nbit=0;
        for(int i=bit.length()-1;i>=0;i--){
            nbit+=Math.pow(2,i);


        }
        return nbit;        
    }
}