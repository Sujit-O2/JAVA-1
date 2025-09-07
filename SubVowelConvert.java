import java.util.ArrayList;

public class SubVowelConvert {
    
}
class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> ll=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(Character.toUpperCase(c)=='A'||Character.toUpperCase(c)=='E'||Character.toUpperCase(c)=='I'||Character.toUpperCase(c)=='O'||Character.toUpperCase(c)=='U'){
                ll.addFirst(c);

            }
        }
        StringBuffer sb=new StringBuffer();
        int i=0;
         for(char c:s.toCharArray()){
            if(Character.toUpperCase(c)=='A'||Character.toUpperCase(c)=='E'||Character.toUpperCase(c)=='I'||Character.toUpperCase(c)=='O'||Character.toUpperCase(c)=='U'){
                sb.append(ll.get(i));
                i++;

            }
            else{
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}