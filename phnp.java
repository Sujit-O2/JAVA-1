import java.util.List;

public class phnp {
    public static void main(String[] args) {
        new Solution().letterCombinations("a");
    }
    
}
class Solution {
    public List<String> letterCombinations(String digits) {
        
        char a[][]=new char[8][3];
        a[5]=new char[4];
        a[7]=new char[4];
        int b=0;
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<a[i].length;j++){
                a[i][j]=(char) ((char)'a'+b);
                b++;
            }
        }
         for(int i=0;i<digits.length();i++){
            for(int j=i+1;j<digits.length();j++){
              
            }
        }
        return null;
        


    }
}