import java.util.ArrayList;
import java.util.List;

public  class pascle {
    public static void main(String[] args) {
        List<List<Integer>> li=new ArrayList<>();;
        System.out.println(new Solution().generate(5));
    }
    
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> l2=new ArrayList<>();
                    List<Integer> l1=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> ll=new ArrayList<>();
           for(int j=0;j<=i;j++){
            if(j>=1&&l1.size()-1>=j){
                ll.add(l1.get(j-1)+l1.get(j));

            }
            else
            ll.add(1);
        

           }
           l2.add(ll);
           l1=ll;
        }
        return l2;
    }
}