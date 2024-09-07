

enum sujit{
   JAGAN("dd"),SUJIT("sujit"),RUDRA("ff");
   private String as;
   sujit(String h){
as=h;
   }
   void jagan(){
    System.out.println(as);
   }
}
public class enumerated_in_java {
    public static void main(String[] args) {
          sujit s= sujit.JAGAN;
          System.out.println(s);
          s.jagan();
    }
}
 