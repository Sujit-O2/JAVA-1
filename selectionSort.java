import java.util.Scanner;

public class selectionSort {
    int B[]=new int[10];
    public void selectionSort1(){
         int max=0,no;
         for(int i=B.length-1;i>=0;i--){
            for(int j=1;j<i;j++){
                if(B[max]<B[j]){
                    max=j;
                }
                
            }
     
            no=B[max];
            B[max]=B[i];
            B[i]=no;
            max=0;

         }
         System.out.println("\n");
        for(int i=0;i<10;i++){
           System.out.println(B[i]);
        }
    }
    public static void main(String[] args) {
          selectionSort bb=new selectionSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 values to the array  ::  ");
        for(int i=0;i<10;i++){
            bb.B[i]=sc.nextInt();

        }
        bb.selectionSort1();
        sc.close();
    }
}
