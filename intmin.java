import java.util.HashMap;

public class intmin {
    
}
class Solution {
    public String minWindow(String s, String t) {
        int minStr=0;
        int length=Integer.MAX_VALUE;
        int left=0;int right=0;
        int have=0;
        HashMap<Character,Integer> targets=new HashMap<>();
        HashMap<Character,Integer> cnt=new HashMap<>();
        for(char c:t.toCharArray()){
            targets.put(c,targets.getOrDefault(c,0)+1);
        }
                int need=targets.size();

        while(right<s.length()){
            char c=s.charAt(right);
            cnt.put(c,cnt.getOrDefault(c,0)+1);
            if(targets.containsKey(c)&&cnt.get(c).intValue()==targets.get(c).intValue()){
                have++;
            }
            while(have==need){
                if(length>right-left+1){
                minStr =left;
                length=right-left+1;
                }
                char leftc=s.charAt(left);
                cnt.put(leftc,cnt.get(leftc)-1);
                if(targets.containsKey(leftc)&&cnt.get(leftc)<targets.get(leftc)){
                    have--;

                }
                left++;


            }
            right++;
        }
        return length==Integer.MAX_VALUE?"": s.substring(minStr,minStr+length);
        
    }
}