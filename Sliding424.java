public class Sliding424 {
    
}
class Solution {
    public int characterReplacement(String s, int k) {
        int right=0;
        int left=0;
        int a[]=new int[26];
        int maxFrq=0;
        int maxdis=0;


        while(right<s.length()){
            char c=s.charAt(right);
            a[c-'A']++;
            maxFrq=Math.max(a[c-'A'],maxFrq);
            while (right-left+1-maxFrq>k) {
                a[c-'A']--;
                left++;
                
            }
            maxdis=Math.max(maxdis,right-left+1);


            right++;
        }
        return maxdis;
        
    }
}