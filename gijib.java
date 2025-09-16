public class gijib {
    
}
class Solution {
    public int[] sumZero(int n) {
       int  index=0;
       int a[]=new int[n];
        for(int i=0;i<=n/2;i++){
            a[index++]=-i;
            a[index++]=i;
        }
        if(n%2!=0){
            a[index]=0;
        }
        
        return a;
    }
}