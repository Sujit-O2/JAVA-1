import java.util.ArrayList;
import java.util.List;

public class phno {
    
}
class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] a =new char[8][3];
        a[6]=new char[4];
        a[8]=new char[4];
        List<String> ll=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            char aa=(char) ('a'+i);
            for(int j=0;j<a[i].length;j++){
                char bb=(char) ('a'+j);
                
                ll.add(aa+bb+"");

            }
        }
        return ll;
    }
}