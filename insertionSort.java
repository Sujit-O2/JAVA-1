import java.util.Scanner;

class insertionSort{
    int A[]= new int[10];
    public void InsertionSort1(){
        int max;

       for(int i=1;i<A.length;i++){
        for(int j=0;j<=i-1;j++){
            if(A[i]<A[j]){
           max=A[i];
           for(int k=i;k>j;k--){
            A[k]=A[k-1];

           }
           A[j]=max;
           
      }
    }
}
        System.out.println("\n");
        for(int i=0;i<10;i++){
           System.out.println(A[i]);
        }
       }
    
    public static void main(String[] args) {
        insertionSort bb=new insertionSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 values to the array  ::  ");
        for(int i=0;i<10;i++){
            bb.A[i]=sc.nextInt();

        }
        bb.InsertionSort1();
        sc.close();
    }
}