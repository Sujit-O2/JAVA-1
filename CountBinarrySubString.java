class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        int prevRun = 0;   
        int currRun = 1;   
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currRun++;
            } else {
                ans += Math.min(prevRun, currRun);
                prevRun = currRun;
                currRun = 1;
            }
        }
        ans += Math.min(prevRun, currRun);
        return ans;
    }
}
