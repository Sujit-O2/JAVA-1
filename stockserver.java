import java.io.IOException;
import java.net.ServerSocket;

public class stockserver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(1111);
        ss.accept();
        
    }
}
