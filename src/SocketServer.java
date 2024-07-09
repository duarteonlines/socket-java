import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {
        int port = 5000;
        try {
            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();
            System.out.println("Client connected" + socket);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = in.readLine();
            in.close();
            socket.close();
            server.close();
            System.out.println("Message: " + msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
