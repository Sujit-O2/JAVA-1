import java.util.ArrayList;
import java.util.List;

public class BaseBall {
    
}
class Solution {
    public int calPoints(String[] operations) {
        List<Integer>scr=new ArrayList<>();
        for(String c:operations){
            if(Character.isDigit(c.charAt(0))){
                scr.add(Integer.parseInt(c));
            }
            else if(Character.isAlphabetic(c.charAt(0))){
                if(c.equals("D")){
                    scr.add(2*scr.getLast());
                }
                else{
                    scr.removeLast();
                }
            }
            else{
                scr.add(scr.getLast()+scr.get(scr.size()-2));
            }

        }
        int sum=0;
        for(Integer i:scr){
            sum+=i;

        }
        return sum;
        
    }
}