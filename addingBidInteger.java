import java.util.*;
import java.math.*;
public class addingBidInteger {

    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        String s1=aa.next();
        String s2=aa.next();
        BigInteger bb=new BigInteger(s1);
        BigInteger cc=new BigInteger(s2);
       BigInteger dd=new BigInteger(bb.add(cc).toString());
       BigInteger ee=new BigInteger(bb.multiply(cc).toString());
        System.out.println(dd.toString());
        System.out.println(ee.toString());
        aa.close();
    }
}