import java.util.Scanner;
public class eligibility {
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print( "Enter the number of Peoples:");
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            System.out.print("Enter the minimum age:");
    		int x = read.nextInt();
            System.out.print("Enter the maximum age:");
    		int y = read.nextInt();
            System.out.print("Enter your age:");
    		int a = read.nextInt();
    		
    		if(a>=x&&a<y){
    		    System.out.println("YES");}
    		    else {
    		        System.out.println("NO");
    		    }
		}
		read.close();
	}
}

