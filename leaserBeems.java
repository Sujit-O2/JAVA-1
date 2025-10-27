public class leaserBeems {
   public static void main(String[] args) {
     String[] s={"011001","000000","010100","001000"};
    new Solution().numberOfBeams(s);
   }
    
}
class Solution {
    public int numberOfBeams(String[] bank) {
        int maxl=0;
        int crrp=0;
        
        for(String s:bank){
            int crrl=0;
            for(char c:s.toCharArray()){
                if(c=='1'){
                    crrl++;
                }
            }

            
            
            if(crrl!=0){
                maxl+=(crrp*crrl);
            crrp=crrl;
            
           
            }
            

        }
        return maxl;
        
    }
}