import java.util.Scanner;

public class larSmalSubsrting{

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int l=0,n=k;
        String aa[]=new String[s.length()-(k-1)];
        for(int i=0;i<s.length()-(k-1);i++){
            aa[i]=s.substring(l,n);
            l=l+1;
            n=n+1;
        }
        
        smallest=aa[0];
         largest=aa[0];
 for(int i=1;i<s.length()-(k-1);i++){
     if(largest.charAt(0)<aa[i].charAt(0)){
         largest=aa[i];
     }
     if(smallest.charAt(0)>aa[i].charAt(0)){
         smallest=aa[i];
     }
         if(largest.charAt(0)==aa[i].charAt(0)){
         for(int a=1;a<k;a++){
     if(largest.charAt(a)<aa[i].charAt(a)){
         largest=aa[i];
         break;
     }
         if(largest.charAt(a)==aa[i].charAt(a)){
        a++;
     }
     }}
     if(smallest.charAt(0)==aa[i].charAt(0)){
            for(int a=1;a<k;a++){
     if(smallest.charAt(a)>aa[i].charAt(a)){
         smallest=aa[i];
         break;
     }
         if(smallest.charAt(a)==aa[i].charAt(a)){
        a++;
     }
     }}
     }  
        return "Smallest is:  "+smallest + "\nLargest  is:  " + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = scan.next();
        System.out.print("Enter the substring Size:");
        int k = Integer.parseInt(scan.nextLine());
       
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}