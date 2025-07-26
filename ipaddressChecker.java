
import java.util.Scanner;

class ipaddressChecker{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
 
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
             in.close();

    }
   
}
class MyRegex{
    String pattern ="^([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])$";
   
}
