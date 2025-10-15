import java.util.HashSet;

public class candies {
    
}
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> ss=new HashSet<>();
        for(int can:candyType){
            ss.add(can);

        }
        if(candyType.length/2<=ss.size()){
            return candyType.length/2;
        }
        else{
            return ss.size();
        }
        
    }
}