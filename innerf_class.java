
class sujit{
    void ff(){};
}
public class innerf_class {
    public class jagan{
        public void run(){
            System.out.println("hello i am inner class");
            sujit ss=new sujit(){
                public void ff(){
                    System.out.println("I AM INNER OF THE INNER");
            
                }
        
            };
            ss.ff();
             
        }
    }
    public static void main(String[] args) {
        innerf_class aa=new innerf_class();
        innerf_class.jagan aaa=aa.new jagan();
        aaa.run();
    }
   
}
