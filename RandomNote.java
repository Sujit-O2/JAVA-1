import java.util.Arrays;

public class RandomNote {
    
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char a[]=ransomNote.toCharArray();
        char b[]=magazine.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0; // i -> ransomNote, j -> magazine
        
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else {
                j++; 
            }
        }
        
        return i == a.length;
        
    }
}