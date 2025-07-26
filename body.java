import java.util.Scanner;

public class body {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ab[][]=new int[a][3];
        for(int i=0;i <a;i++){
            for(int j=0;j<3;j++){
                ab[i][j]=sc.nextInt();
            }
        }
    
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<a;j++){
                sum=sum+ab[j][i];
            }
            if(sum!=0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}
