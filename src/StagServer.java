import java.io.*;
import java.net.*;
import java.util.*;

class StagServer
{
    final static char EOT = 4;
    private ServerSocket ss;
    private Socket socket;
    public static void main(String args[])
    {
         new StagServer( 8888);
    }

    public StagServer( int portNumber)
    {
        try {
            ss = new ServerSocket( portNumber);
            System.out.println("Server Listening");
            socket = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true) acceptNextConnection(in);
        } catch(IOException ioe) {
            System.err.println(ioe);
        }
    }

    private void acceptNextConnection(BufferedReader in)
    {
        try {
            // Next line will block until a connection is received
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            System.out.println(in.readLine());
//            out.write("hello"+"\n");
//            out.flush();
            processNextCommand(in, out);
        } catch(IOException ioe) {
            System.err.println(ioe);
        }
    }

    private void processNextCommand(BufferedReader in, BufferedWriter out) throws IOException
    {
        String line = in.readLine() ;
//        while ((line = in.readLine()) != null) {
//            System.out.println(line);
//        }
        out.write("hello"+"\n");
        out.write("" + EOT + "" + "\n");
        out.flush();
    }
}
