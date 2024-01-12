import java.util.*;
public class ncr {
    static long nccr(int n,int r){
        long ans=fact(n)/(fact(r)*fact(n-r));
        return ans;  
    }
    static long fact(int n){
        int j=1;
        for(int i=2;i<=n;i++){
            j=j*i;
        }
        return j;
    }
    public static void main(String[] args) {
        System.out.print("Enter the  n value: ");
        Scanner Se=new Scanner (System.in);
        int n=Se.nextInt();
        System.out.print("Enter the value of r(r<<n ): ");
        int r=Se.nextInt();
        if(n<r){
            System.out.println(">>>>>>>>>>>>>>>>>Go to hell<<<<<<<<<<<<<<<<<<<<<");
        }
        else{
            System.out.println("the value is: "+nccr(n,r));
        }
        Se.close();
    }
}
