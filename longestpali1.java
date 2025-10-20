import java.util.HashMap;

public class longestpali1 {
    
}
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> in=new HashMap<>();
        for(char c:s.toCharArray()){
            in.put(c,in.getOrDefault(c,0)+1);
        }
        int maxEven=0;
        int macodd=0;
        for(Character c1:in.keySet()){
            if(in.get(c1)%2==0){
                maxEven+=in.get(c1);
            }
            else{
                macodd=1;
                
                maxEven+=in.get(c1)-1;
            }
        }
        if(macodd==1) maxEven++;
        return maxEven;
    }
}