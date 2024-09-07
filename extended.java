import java.io.*;
import java.util.*;

public class extended {

    public static void main(String[] args) {
        Sports ss=new Sports();
        System.out.println(ss.getName());
        ss.getNumberOfTeamMembers();
        ss=new Soccer();
         System.out.println(ss.getName());
        ss.getNumberOfTeamMembers();
    }}
    
     class Sports{
        String getName(){
            return "Generic Sports";
            
        }
       void getNumberOfTeamMembers(){
        System.out.println( "Each team has +n+ players in " + getName() );
    }
    }
    class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
