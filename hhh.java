import java.util.ArrayList;
import java.util.Arrays;

public class hhh {
    public static void main(String[] args) {
        Solution ss=new Solution();
        int a[]={0};
        System.out.println(Arrays.toString(ss.plusOne(a)));
        
        
    }
    
}
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
           if(digits[i]<9){
            digits[i]++;
            return digits;
           }
           digits[i]=0;

       }
       int []a=new int[digits.length+1];
       a[0]=1;
       

        return a ;
    }
}