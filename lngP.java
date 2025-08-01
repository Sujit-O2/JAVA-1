import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lngP {
    
}

    class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pp=Pattern.compile(p);
        Matcher mm=pp.matcher(s);
        return mm.matches();

        
    }
}
