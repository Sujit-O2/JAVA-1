import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@hii(sujit=10)
public class anotations{
    void jagan(){
        System.out.println("good morning");
    }
    @Deprecated
    int sujit(){
        return 10;
    }
    public static void main(String[] args) {
        @SuppressWarnings("object")
        anotations a=new anotations();
        a.sujit();
        a.jagan();
        anotations bb=new anotations();
    }
 }
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface hii{
 int sujit();
}