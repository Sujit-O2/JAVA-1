public class A2 implements Runnable
{
	public void run()
	{
		System.out.println("in run() method"+Thread.currentThread()); // This method is static.
	}
	public static void main(String[] args) 
	{
		A2 a = new A2();
		Thread t1 = new Thread(a, "NewThread 1");
		t1.setPriority(2); // Setting the priority of thread.
		Thread t2 = new Thread(a, "NewThread 2");
		t2.setPriority(10);
		System.out.println("Priority of Thread: " +t1.getPriority());
		System.out.println("Name of Thread: " +t1.getName());
		System.out.println("Priority of Thread: " +t2.getPriority());
		System.out.println("Name of Thread: " +t2.getName());
		t1.start();
		t2.start();
	}
}