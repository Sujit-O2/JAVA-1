import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listProblem {

    public static void main(String[] args) {
        List<Integer> ls= new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            System.out.println("sujit");
            ls.add(sc.nextInt());
        }
        a=sc.nextInt();
        int i=0;
        while( i<a){
            String mode =sc.next();
            if(mode.equals("Insert")){
                int b=sc.nextInt();
                int c=sc.nextInt();
                ls.add(b,c);
            }
            else if(mode.equals("Delete")){
                int b=sc.nextInt();
                ls.remove(b);
            }
            i++;
        }
        sc.close();
        for(i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }
    }
}