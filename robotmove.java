public class robotmove {
    
}
class Solution {
    public boolean judgeCircle(String moves) {
        int ud=0;
        int lr=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                ud++;

            }
            else if(c=='D'){
                ud--;
                
            }
            else if(c=='L'){
                lr++;
            }
            else if(c=='R'){
                lr--;
                
            }

        }
        if(lr==0&&ud==0){
            return true;
        }
        return false;
        
    }
}