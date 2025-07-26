import java.util.Scanner;

// public class jagan {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2;
//         for(int i=0;i<n1;i++){
//             n2=sc.nextInt();
//             System.out.println(n2-1);
            
//             }
//             sc.close();
//         }
//     }

public class jagan {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            String s=sc.next();
            StringBuffer bs=new StringBuffer(s);
            bs.reverse();
            for(int j=0;j<bs.length();j++){
                if(bs.charAt(j)=='p'){
                    bs.setCharAt(j,'q');
                }
                else  if(bs.charAt(j)=='q'){
                    bs.setCharAt(j,'p');
                }
            }
            System.out.println(bs);
            
        }
        sc.close();
    }
}