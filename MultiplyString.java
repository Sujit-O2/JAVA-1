import java.math.BigInteger;

public class MultiplyString {
    
}
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger bb=new BigInteger(num1);
        BigInteger b1=new BigInteger(num2);
        return b1.multiply(bb).toString();

        
    }
}