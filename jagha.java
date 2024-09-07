import java.util.Scanner;

public class jagha {
    public static void main(String[] args) {
      String s[]=new String[10];

        String s1;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
          s1=sc.nextLine();
          s[i]=s1;
        }
        for(int i=0;i<10;i++)
        System.out.println(s[i]);
    }
}
