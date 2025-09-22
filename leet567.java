import java.util.Arrays;
public class leet567 {
    
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        StringBuffer sb=new StringBuffer(s2.substring(0,s1.length()));
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        s1 = new String(chars);     
        String s3=sb.toString();
            char[] char1 = s3.toCharArray();
            Arrays.sort(char1);
            s3 = new String(char1);
            if(s3.equals(s1)){
            return true;
        }  
        for(int i=s1.length();i<s2.length();i++){
        sb.deleteCharAt(0);
        sb.append(s2.charAt(i));
         s3=sb.toString();
            char1 = s3.toCharArray();
            Arrays.sort(char1);
            s3 = new String(char1);
            if(s3.equals(s1)){
            return true;
        }

        }
        

        return false;
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
             if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26]; 
        int[] count2 = new int[26]; 
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if (matches(count1, count2)) return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            count2[s2.charAt(i - s1.length()) - 'a']--;
            count2[s2.charAt(i) - 'a']++;

            if (matches(count1, count2)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    }