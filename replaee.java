
import java.util.*;
class replaee{
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        System.out.println("enter the sentence: ");
        String ss= se.nextLine();
        System.out.print("enter the replace word: ");
        String sa=se.next();
        System.out.print("enter the new word: ");
        String ssa=se.next();
        String sss=ss.replaceAll(sa,ssa);
        System.out.println("The modified  string is : "+sss);
        se.close();
    }
}