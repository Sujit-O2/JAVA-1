
import java.util.Arrays;
import java.util.Scanner;

public class jumpingProblem {
    public static void main(String[] args) {
      

    int a[]={1,2,3,4,5,6,7,8,9,0,122,1,1,1,1,1,2,4,6,89,9,67,56,545,6634};
   int b[]=new int[a.length+1];
   Arrays.fill(b,-1);
        jumpingProblem jj=new jumpingProblem();
        
        System.out.println(jj.jump(a.length-1,a,b));
        System.out.println(jj.jump(a.length,a));
    }
      int  jump(int ind,int a[],int b[]){
        if(ind==0)return 0;
        if(b[ind]!=-1)return b[ind];
        int left=jump(ind-1,a,b)+Math.abs(a[ind]-a[ind-1]);
        int right=Integer.MAX_VALUE;
        if(ind>1){
            right=jump(ind-2,a,b)+Math.abs(a[ind]-a[ind-2]);

        }

       return b[ind]=(Math.min(left,right));

}
int jump(int a,int b[]){
    int dp[]=new int[a];
    Arrays.fill(dp,0);
    for(int i=1;i<a;i++){
        int fs=dp[i-1]+Math.abs(b[i]-b[i-1]);
        int ss=Integer.MAX_VALUE;
        if(i>1){
            ss=dp[i-2]+Math.abs(b[i]-b[i-2]);
        }
        dp[i]=Math.min(ss,fs);

    }
    return dp[a-1];
}
    
    
}
