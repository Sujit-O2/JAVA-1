public class consicutiveNo {
    
}
class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));

        for (int i = 2; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(sb.charAt(sb.length() - 1) == c && sb.charAt(sb.length() - 2) == c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}