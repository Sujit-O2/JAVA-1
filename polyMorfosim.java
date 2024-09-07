public class polyMorfosim {
    public static void main(String []args){
        jagan aa=new jagan();
        aa.jaga(20,40);
        aa.jaga(12);
      System.out.printf("%d",aa.jaga(20l));
     aa.suji();
     jagan aaa=new aaaaa();
     aaa.suji();
    }

   
}
class jagan{
void jaga(int a,int b){
    System.out.println("sum is::"+(a+b));
}
void jaga(int a){
    System.out.print(a+" is ");
    if(a%2==0){
        System.out.println("EVEN");
    }
    else{System.out.println("ODD");}
}
 long jaga(long a){
    if(a%2==0)
    return a;
    else return 1;
}
void suji(){
    System.out.println("\ngood afternoon");
}
}
class aaaaa extends jagan{
    void suji(){
        System.out.println("hii");
    }
}

