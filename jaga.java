import p2.avareja;
import java.util.*;
public class jaga {
    public static void main(String[] args) {
        System.out.println("enter the  size of n:");
        Scanner SE=new Scanner(System.in);
        int a=SE.nextInt();
        int aa[]=new int[a];
        System.out.println("Enter the elements: ");
        for(int i=0;i<a;i++){
            aa[i]=SE.nextInt();
        }
        float ave=avareja.avrage(aa,a);

        System.out.println("the avrage value is: "+ave);
        SE.close();
    }
}
