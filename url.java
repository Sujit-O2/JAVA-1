import java.net.Socket;

public class url {
    public static void main(String[] args) {
        String ServerName=args[0];
        int sId=Integer.parseInt(args[1]);
        System.out.println( ServerName);
        System.out.println( sId);
        try{
            System.out.println("Trying to Connect "+ServerName);
            Socket cc= new Socket(ServerName,sId);
            System.out.println("Connected to "+cc.getRemoteSocketAddress());

        }catch(Exception e){
            e.printStackTrace();


        }
    }
}
