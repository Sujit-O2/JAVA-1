

public class A implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread()); // This method is static.
	}
	public static void main(String[] args) 
	{
		A a = new A();
		Thread t = new Thread(a, "NewThread");
		t.setPriority(2); // Setting the priority of thread.
 
		System.out.println("Priority of Thread: " +t.getPriority());
		System.out.println("Name of Thread: " +t.getName());
		t.start();
	}
}