public class threadll {

    public static void main(String[] args) {
      a a=new a();
      b b=new b();
      c c=new c();
      a.start();
      b.start();
      c.start();
    }
}
class a extends Thread{
public void run() {

    for(int i=0;i<10;i++){
       System.out.print(currentThread().getName()+" "); System.out.println("jagan");
       try {
        join(20);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}}
class b extends Thread{
    public void run(){
     for(int i=0;i<10;i++){
        
        System.out.print(currentThread().getName()+" "); System.out.println("sujit"); } }}
class c extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
             System.out.print(currentThread().getName()+" ");System.out.println("rudra");
            if(i==6){
                interrupt();
            }
        }
    }
}
