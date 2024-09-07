import java.io.*;
import java.math.*;
public class primenn {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        //math packages class bigInteger
        BigInteger bb=new BigInteger(s);
        //isProbablePrime is the method of BigInteger
        //here 2 is below 2 is not prime 
        //te returns true if it is prime else false
        if(bb.isProbablePrime(2)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
       
    }
}
