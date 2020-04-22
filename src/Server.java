import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket defaultSocket = new ServerSocket(8888);

        System.out.println("Listening on port: " + 8888);
        Socket connectionSocket = defaultSocket.accept();
        BufferedReader fromClient= new BufferedReader(new     InputStreamReader(connectionSocket.getInputStream()));
        String msg = fromClient.readLine();;
        while (msg!=null){
            System.out.println("Received: " + msg);
            msg = fromClient.readLine();
        }
    }

}