import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 5000;
        try {
            Socket socket = new Socket(serverAddress, port);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String msg = "Hello Server";
            out.write(msg);
            out.flush();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
