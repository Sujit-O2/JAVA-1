public class pali2 {
    
}
class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder bb=new StringBuilder(s);
        StringBuilder b2=new StringBuilder(s);

        bb.reverse();
        int remove=0;
        for(int i=0;i<bb.length();i++){
            if(bb.charAt(i)!=b2.charAt(i)){
                if(remove==0){
                b2.deleteCharAt(b2.indexOf(bb.charAt(i)+""));
                bb.deleteCharAt(i);
                remove++;
                
            }
        }

        }

        return bb.toString().equals(b2.toString());
    }
}
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
