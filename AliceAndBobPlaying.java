public class AliceAndBobPlaying {
    public static void main(String[] args) {
        Solution ss=new Solution();
        long a =ss.flowerGame(4,4);
        System.out.println(a);
    }
}
class Solution {
    public long flowerGame(int n, int m) {
        int i=1,j=1;
        long count=0;
        while(i<=n&&j<=m){
            if(i==j){
                j++;
                

            }
            
            if(i!=j&&j<=m){
                if(i%2!=j%2){
                count++;
                
                }
                j++;
        }
        if(j>m){
                i++;
                j=1;
            }
        }
        return count;
        
    }
    public long flowerGame(int n, int m) {
        return ((long)m*n)/2;
    }
}