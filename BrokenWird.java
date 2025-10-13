public class BrokenWird {
    
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String s[]=text.split(" ");
        char s1[]=brokenLetters.toCharArray();
        int a=0;
        int c1=s.length;
        while(a<s.length){
            for(char c:s1){
                if(s[a].contains(c+"")){
                    c1--;
                    break;

                }
            }
            a++;
        }
        return c1;
    }
}