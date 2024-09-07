import java.util.Scanner;

class verySimpleTax
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    	if(x>100){
    	    System.out.println(x-10);
    	}
    	else{
    	    System.out.println(x);
    	}
    		
		}
		read.close();
	}
}
