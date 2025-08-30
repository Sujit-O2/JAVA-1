public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2; // Avoid integer overflow
            if (isBadVersion(mid)) {
                right = mid; // First bad version is at mid or earlier
            } else {
                left = mid + 1; // First bad version is after mid
            }
        }
        
        return left; // left == right, pointing to the first bad version
    }
}