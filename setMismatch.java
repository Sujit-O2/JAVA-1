public class setMismatch {

    
}
class Solution {
    public int[] findErrorNums(int[] nums) {
        int q[]=new int[2];
        boolean a[]=new boolean[nums.length];
        int dupl=0;
        int miss=0;
       for(int x: nums){
        if(a[x-1]==true){
            dupl=x;
        }
        a[x-1]=true;

       }
       for(int i=0;i<nums.length;i++){
        if(!a[i]){
            miss=i+1;


        }
       }
       q[0]=dupl;
       q[1]=miss;
        return q;
        
    }
}