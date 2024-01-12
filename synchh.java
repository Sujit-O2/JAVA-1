public class synchh{
     public static void main(String[] args) {
        synch aa=new synch();
         c c= new c(aa);
        
       c.start();
        new b(aa).start();
      
    }
}
 class synch extends Thread{
    static int  i=10;
    public   synchronized void jagan(int j){
        if(j<i){
i=i-j;
System.out.println(j+" are booked");
System.out.println(i+" remaining");

}
else{
    System.out.println("good night");
}
    }
}
class b extends Thread{
    private synch ch;
b(synch ch){
this.ch=ch;
}
    public void run(){
       ch. jagan(3);
    }
}
class c extends Thread{
     private synch ch;
c(synch ch){
    this.ch=ch;
}
    public  void run(){
      
    ch.jagan(5);
       
}
}
