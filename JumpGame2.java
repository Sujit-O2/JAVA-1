public class JumpGame2 {
    
}
class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int go=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            go=Math.max(go,i+nums[i]);
            if(i==end){
                jump++;
                end=go;
            }
        }
        return jump;
        
    }
}