public class YieldDemo2 implements Runnable
{
    public void run()
    {
        System.out.println("Started " + Thread.currentThread());
        // calling yield() method on current thread to move it
        // back to ready state from running state
        Thread.yield();
        System.out.println("Ended " + Thread.currentThread());
    }
    public static void main (String[] args)
    {
        YieldDemo2 y1 = new YieldDemo2();
        // creating first thread
        Thread t1 = new Thread(y1, "First child thread");
        YieldDemo2 y2 = new YieldDemo2();
        // creating second thread
        Thread t2 = new Thread(y2, "Second child thread");
        // calling thread will execute run() function
        t1.start();
        t2.start();
    }
}