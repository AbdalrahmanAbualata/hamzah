import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class abd2 {
    public static void main(String[] args) throws IOException {
        Socket pingSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            pingSocket = new Socket("telehack.com", 23);
            //  pingSocket = new Socket("172.16.2.51", 23);
            out = new PrintWriter(pingSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
            
           out.write("calc" + "\r");
           out.flush();
            // out.println("ping");
            // out.flush();
            // out.println();
            
        } catch (IOException e) {
             System.out.println("no connection");
             System.out.println(e);
        }


        // System.out.println(pingSocket.getPort() +"          knkjlninoinoi abdss");

        // out.print("ping");
        // out.println();
        String temp="";
            while((temp=in.readLine())!=null)
            {
            System.out.println(temp);
            }
        // System.out.println(in.readLine());
        // out.close();
        // in.close();
        // pingSocket.close();
    }
    }
