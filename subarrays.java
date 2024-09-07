// Print the number of subarrays of  having negative sums.

// Sample Input

// 5
// 1 -2 4 -5 1
// Sample Output

// 9
import java.io.*;
import java.util.*;

public class subarrays {

    public static void main(String[] args) {
     Scanner se=new Scanner(System.in);
     int count=0;
     int a =se.nextInt();
     int A[]= new int[a];
     for(int i=0;i<a;i++){
         A[i]=se.nextInt();
     }
     int sum=0;
     
    for(int i=0;i<a;i++){
        for(int j=i;j>=0;j--){
            sum=sum+A[j];
            if(sum<0){
                ++count;
            }
        }
        sum=0;
    }
         
     
     System.out.println(count);
     
    }
}