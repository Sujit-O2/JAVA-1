import java.util.HashMap;

public class Sort {
    
}

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> mm = new HashMap<>();

        for (char c : licensePlate.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = Character.toLowerCase(c);
                mm.put(c, mm.getOrDefault(c, 0) + 1);
            }
        }

        String ans = null;

        for (String s : words) {
            boolean f = true;
            HashMap<Character, Integer> mw = new HashMap<>();

            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    c = Character.toLowerCase(c);
                    mw.put(c, mw.getOrDefault(c, 0) + 1);
                }
            }

            for (char c1 : mm.keySet()) {
                if (mw.getOrDefault(c1, 0) < mm.get(c1)) {
                    f = false;
                    break;
                }
            }

            if (f) {
                if (ans == null || s.length() < ans.length()) {
                    ans = s;
                }
            }
        }

        return ans;
    }
}
