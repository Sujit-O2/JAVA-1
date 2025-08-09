import java.util.ArrayList;
import java.util.List;

public class Rowindex {
     public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();;
        System.out.println(new Solution().getRow(3));
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> ll=new ArrayList<>();
           for(int j=0;j<=i;j++){
            if(j>=1&&l1.size()-1>=j){
                ll.add(l1.get(j-1)+l1.get(j));

            }
            else
            ll.add(1);
        

           }
           
           l1=ll;
        }
        return l1;
    }
}