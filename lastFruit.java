public class lastFruit {
    
}
class Solution {
    public int totalFruit(int[] fruits) {
        
        int f1=-1;
        int f2=-1;
        int lastf=0;
        int count =0;
        int maxc=0;
        for(int f:fruits){
            if(f==f1||f==f2){
                count++;

            }
            else{
                count=lastf+1;

            }
            if(f==f2){
                lastf++;
            }else{
                lastf=1;
                f1=f2;
                f2=f;
            }
            maxc=Math.max(maxc,count);
        }
        return maxc;
    }
}