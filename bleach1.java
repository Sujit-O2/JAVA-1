import java.math.BigInteger;


public class bleach1 {
    public static void main(String[] args) {
        Solution ss= new Solution();
       System.out.println( ss.myAtoi(""+Integer.MAX_VALUE+5));

    }
    
}

class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i =0;
        long a=1;
        if (s.length() == 0) return 0;
        if(s.charAt(0)=='-'){
            a=-1;
            i=1;

        }
        else if(s.charAt(0)=='+'){
            i=1;
        }
        StringBuilder s1=new StringBuilder();
       
       
        for( i=i;i<s.length();i++){
          
            if(Character.isDigit(s.charAt(i))){
                s1.append(s.charAt(i));
            }
            else{
                break;
            }
        }
        BigInteger bint;
        if(s1.length()>0){
            bint =new BigInteger(s1.toString());
           bint= bint.multiply(BigInteger.valueOf(a));
        }
        else return 0;

        if(bint.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>0){
            return Integer.MAX_VALUE;
        }
        if(bint.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))<0){
            return Integer.MIN_VALUE;
        }
        return bint.intValue();
    }
}