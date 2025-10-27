import java.util.ArrayList;
import java.util.List;

public class SelfDrivenno {
    
}
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList();

        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                result.add(i);
            }
        }

        return result;
    }

    private boolean isSelfDividing(int num) {
        int temp=num;
        while(temp>0){
            int dig=temp%10;
            if(dig==0||num%dig!=0){
                return false;
            }
            temp/=10;
        }
        return true;
}
}
