public class StringTOInteger {

    
}
class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        s = s.trim();
        if (s.length() == 0) return 0;

        int sign = 1;
        int i = 0;
        long num = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (num * sign);
    }
}
