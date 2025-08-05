import java.lang.reflect.Array;
import java.util.Arrays;

public class ig {
    
}
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int a=0;
        boolean B[]=new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++){
            boolean placed=false;

            for(int j=0;j<baskets.length;j++){
                if(!B[j]&&baskets[j]>=fruits[i]){
                    B[j]=true;
                    placed=true;
                    break;
                }
            }
            if(!placed){
                a++;

            }
        }
        return a;
    }
}