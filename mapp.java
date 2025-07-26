import java.io.*;
import java.util.*;

public class mapp {

    public static void main(String[] args) throws Exception{
            Map<String,Integer>aa= new HashMap<>();

    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(sc.readLine());
        for(int i=0;i<a;i++){
        aa.put(sc.readLine(),Integer.parseInt(sc.readLine()));
        }
        for(int i=0;i<aa.size();i++){
        String key=sc.readLine();
        if(aa.containsKey(key))
        System.out.println(key+"="+aa.get(key));
        else{
        System.out.println("Not found");
        }
        }
    }
}