
class TestMultiNaming extends Thread
{  
	public void run()
	{  
		System.out.println("running..."+Thread.currentThread());  
	} 
}
class TestMultiNaming2
{
	public static void main(String args[])
	{ 
		TestMultiNaming obj=new TestMultiNaming();
		Thread t1=new Thread(obj,"THREAD 1");  
		Thread t2=new Thread(obj,"THREAD 2");  
		System.out.println("Name of t1:"+t1.getName());  
		System.out.println("Name of t2:"+t2.getName());  
   
		t1.start();  
		t2.start();  
  
	}  
}  