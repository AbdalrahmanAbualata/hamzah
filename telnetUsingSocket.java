import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;

public class telnetUsingSocket {
    public static void main(String[] args) throws IOException, InterruptedException {

        Socket pingSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {

           // create socket 
            pingSocket = new Socket("telehack.com", 23);
            // create output Strem to send data to server 
            out = new PrintWriter(pingSocket.getOutputStream(), true);
            // create input stream to get the response from the server 
            in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));

            // close the socket after spacefic time 
            pingSocket.setSoTimeout(10000);


            // sleep for a 1 sec 

            Thread.sleep(2000);

            // print the response from the server 
            telnetUsingSocket.read(in);

            // System.out.println("Sending username");

          
            Thread.sleep(2000);

            // print a commend in cmd for the host server using outputStream 
            out.println("weather");
            Thread.sleep(2000);
            telnetUsingSocket.read(in);
            out.println("host");
            out.flush();
            Thread.sleep(2000);
            telnetUsingSocket.read2(in); 
            // System.out.println("Sending password");
            // out.println("password");
            // telnetUsingSocket.read(in);
        
            in.close();
            out.close();
            pingSocket.close();
            
        } catch (IOException e) {
            return;
        }
    //     out.write("ping");
    //     out.println("ping");

    //     String temp="";
    // while((temp=in.readLine())!=null)
    // {
    // System.out.println(temp);
    // }
    //     out.close();
    //     in.close();
    //     pingSocket.close();
    }

    static void read(BufferedReader in) throws IOException
{
  char[] ca = new char[2048];
  int rc = in.read(ca);
  String s = new String(ca).trim();

  Arrays.fill(ca, (char)0);

//   System.out.println( rc + ":" + s);
  System.out.println( rc + ":" + s);

//String s = br.readLine();
//      
//while(s != null)
//{
//  if(s.equalsIgnoreCase("username:"))
//    break;
//          
//  s = br.readLine();
//          
//  System.out.println(s);
}


static void read2(BufferedReader in) throws IOException
{

    
//   char[] ca = new char[2048];
//   int rc = in.read(ca);
//   String s = new String(ca).trim();

//   Arrays.fill(ca, (char)0);

//   System.out.println( rc + ":" + s);

String s = in.readLine();
     
while(in != null)
{        
 s = in.readLine();
         
 System.out.println(s);
}
}
}