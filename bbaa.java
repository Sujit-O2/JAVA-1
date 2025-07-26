import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class bbaa {
    
    public static void main(String[] args) throws IOException {
        BufferedReader cs=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<jagan> ar=new ArrayList<>();
        jagan j=new jagan(cs.readLine(),5);
        ar.add(j);
        j=new jagan(cs.readLine(),7);
        ar.add(j);
        j= new jagan(cs.readLine(),5);
        ar.add(j);
        for(jagan a:ar){
            int Count=a.b;
            String c=a.a;
            for(int i=0;i<c.length();i++){
                if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u'){
                    Count--;
                }
            }
            if(Count!=0){
                System.out.println("NO");
                return;
            }
            

        }
        System.out.println("YES");

    }
}
class jagan{
    String a;
    int b;
    jagan(String a,int b){
        this.a=a;
        this.b=b;

    }
}
