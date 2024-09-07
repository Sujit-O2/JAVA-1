class Multi2 implements Runnable
{  
	public void run()
	{  
		System.out.println("thread is running...");  
	}  
  	public static void main(String args[])
	{  
		Multi2 m1=new Multi2();  
		Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
		t1.start();  
	}  
}  