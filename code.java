import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        if(s1.equals(sb.toString())){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
