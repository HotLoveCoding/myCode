import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shkstart
 * @create 2019-04-12 17:06
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        byte[] byteArray = new byte[1024];
        int len = in.read(byteArray);
        System.out.println(new String(byteArray,0,len));
        in.close();
        server.close();
    }
}
