import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPriblem {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
               ArrayList<ArrayList<Integer>> suu=new ArrayList<>(a);
               for(int i=0;i<a;i++){
                ArrayList<Integer> su=new ArrayList<>();
                int j=sc.nextInt();
                
                for(int kk=0;kk<j;kk++){
                    su.add(sc.nextInt());
                }
                suu.add(su);

               }
                a=sc.nextInt();
               for(int i=0;i<a;i++){
                int j=sc.nextInt();
                int k=sc.nextInt();
                try{
                System.out.println(suu.get(j-1).get(k-1));
                }
                catch(Exception e){
                   System.out.println("Error!");
                }
               sc.close();

               }
    }

}