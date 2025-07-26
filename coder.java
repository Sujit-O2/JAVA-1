import java.util.Scanner;

public class coder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int cc[]=new int[a];
        for(int i=0;i<a;i++){
            cc[i]=sc.nextInt();

        }
        int normalmax=cc[0];
        int normalmin=cc[0];
        int count=0;
        for(int i=1;i<a;i++){
                if(normalmax<cc[i]){
                    count++;
                    normalmax=cc[i];
                }
                else if(normalmin>cc[i]){
                    count++;
                    normalmin=cc[i];
                }
        }
            System.out.println(count);
            sc.close();

    }
}
