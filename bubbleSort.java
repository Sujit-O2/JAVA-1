import java.util.Scanner;
public class bubbleSort {
    int A[]= new int[10];
    public void bubbleSort1(){
        int max;

       for(int i=9;i>=0;i--){
        for(int j=0;j<=i-1;j++){
            if(A[j]>A[j+1]){
            max=A[j];
            A[j]=A[j+1];
            A[j+1]=max;
           
      }
    }
}
        System.out.println("\n");
        for(int i=0;i<10;i++){
           System.out.println(A[i]);
        }
       }
    
    public static void main(String[] args) {
        bubbleSort bb=new bubbleSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 values to the array  ::  ");
        for(int i=0;i<10;i++){
            bb.A[i]=sc.nextInt();

        }
        bb.bubbleSort1();
        sc.close();
    }
}
