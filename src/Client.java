
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String args[]) throws UnknownHostException, IOException, InterruptedException{
        Socket clientSocket = new Socket("localhost", 8888);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        int c = 0;
        while(true){
            BufferedReader commandLine = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            String command = commandLine.readLine();
            out.write("hello" + "\n");
            outToServer.writeBytes(command + "\n");
            outToServer.flush();
            out.flush();
            c++;
            Thread.sleep(500);
        }
    }
}