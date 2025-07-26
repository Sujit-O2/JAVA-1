// A Java program to demonstrate working of
// synchronized.


// A Class used to send a message
class Sender {
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

// Class for send a message using Threads
class ThreadedSend extends Thread {
	private String msg;
	Sender ss;

	// Receives a message object and a string
	// message to be sent
	ThreadedSend(String msg, Sender obj)
	{
		this.msg = msg;
		ss = obj;
	}

	public void run()
	{
		// Only one thread can send a message
		// at a time.
		//synchronized (sender)
		//{
			// synchronizing the send object
			ss.send(msg);
		//}
	}
}

// Driver class
class SyncDemo3 {
	public static void main(String args[])
	{
		Sender send = new Sender();
		ThreadedSend S1 = new ThreadedSend(" Hi ", send);
		ThreadedSend S2 = new ThreadedSend(" Bye ", send);

		// Start two threads of ThreadedSend type
		S1.start();
		S2.start();

		// wait for threads to end
		try {
			S1.join();
			S2.join();
		}
		catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
