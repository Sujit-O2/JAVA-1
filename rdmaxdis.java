import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class rdmaxdis {

}
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>sh=new HashSet<>();
        for(int i:nums){
            sh.add(i);

        }
        ArrayList<Integer> ll=new ArrayList<>(sh);
        Collections.sort(ll);
        if(ll.size()<3){
            return ll.get(ll.size()-1);
        
        }
        else{
            return ll.get(ll.size()-3);
        }
        
    }
}