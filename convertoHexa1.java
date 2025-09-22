public class convertoHexa1 {
    
}
class Solution {
    public String toHex(int num) {
        StringBuilder bb=new StringBuilder();
         if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
       

       
        long n = num & 0xFFFFFFFFL;

        while (n != 0) {
            int remainder = (int) (n % 16);
            bb.append(hexChars[remainder]);
            n /= 16;
        }

        return bb.reverse().toString();
        
    }
}