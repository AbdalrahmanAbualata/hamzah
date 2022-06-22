import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// import java.util.List;
import java.util.Scanner;
/**
 * hamza
 */

public class hamza {
    static hamza hamza = new hamza();

    public static void main(String[] args) throws IOException, InterruptedException {


        // Process p;
        // try {
        //   List<String> cmdList = new ArrayList<String>();
        //   cmdList.add("C:\\Program Files\\PuTTY\\psftp");
        //   cmdList.add("C:\\Windows\\System32\\telnet.exe");
        //   cmdList.add("cmd.exe");
        //   cmdList.add("/c");
        //   cmdList.add("telnet telehack.com");
        //   ProcessBuilder pb = new ProcessBuilder();
        //   pb.command(cmdList);
        //   p = pb.start();
        // //   pb.command("help");
        // //   Process l= pb.start();
        //   p.waitFor(); 
        //   BufferedReader reader=new BufferedReader(new InputStreamReader(
        //             p.getInputStream())); 
        //   String line; 
        //   while((line = reader.readLine()) != null) { 
        //     System.out.println(line);
        //   } 
        // } catch (IOException e) {
        // //   TODO Auto-generated catch block 
        //   e.printStackTrace();
        // } catch (InterruptedException e) {
        //   // TODO Auto-generated catch block
        //   e.printStackTrace();
        // }
           
        // ProcessBuilder builder = new ProcessBuilder(
        //     "C:\\Program Files\\PuTTY\\psftp", "/c", "-V");
        // builder.redirectErrorStream(true);
        // Process p = builder.start();
        // // p.waitFor();
        // BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        // BufferedWriter output = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
        // // String commandInput = "telnet 10.69.s18.5 1521";
        // // output.write(commandInput);
        // // output.flush();
        // String line;
        // String abd = "";
        // while (true) {
        //     line = r.readLine();
        //     if (line == null) { break; }
        //     abd= abd + "\n" + line ;
        // }

        //  System.out.println(abd);


//         Runtime rt = Runtime.getRuntime();
//         String[] command = {"ls", "-al"};
//         Process p =  rt.exec("cmd /c telnet");
//          BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
//          String line;
//          String abd = "";
//          while (true) {
//              line = r.readLine();
//              if (line == null) { break; }
//              abd= abd + "\n" + line ;
//          }

//  System.out.println(abd);


PrintWriter out ;
BufferedReader stdin;
 try (Socket telnetClient = new Socket("telehack.com",23)) {
    // telnetClient.getChannel();
    // BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
     stdin=new BufferedReader(new InputStreamReader(telnetClient.getInputStream()));
     out=new PrintWriter(telnetClient.getOutputStream());

     Thread.sleep(1000);
     out.write("calc"+"\r");
   
     Thread.sleep(1000);
    String temp="";
    while((temp=stdin.readLine())!=null)
    {
    System.out.println(temp);
    }
}
 

 


        // Console c=System.console();  
        //  String n=c.readLine();
        // c.flush();
        // System.out.println("Enter your name: ");    
        // String n=c.readLine();    
        // System.out.println("Welcome "+n);  
        
    //    try (Scanner d = new Scanner(System.in)) {
        
    //     String a = d.nextLine();
    //        String va = d.nextLine();
    //        System.out.println("Welcome "+a);
    //        System.out.println("Welcome "+va);
    // } catch (Exception e) {
    // }



//     String command = "REG QUERY HKEY_CLASSES_ROOT\\http\\shell\\open\\command";
// try
// {
//     Process process = Runtime.getRuntime().exec(command);

//     Scanner kb = new Scanner(process.getInputStream());
//     System.out.println(kb.nextLine());
//     System.out.println(kb.nextLine());
// } catch (IOException e)
// {
//     e.printStackTrace();
// }


///////////////////////////////////////////////////////////////////////
    //  hamza.executeCommand("ls");


    }

    private String executeCommand(String command) {
        try {
            log(command);
            Process process = Runtime.getRuntime().exec(command);
            logOutput(process.getInputStream(), "");
            logOutput(process.getErrorStream(), "Error: ");
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }
    
    private void logOutput(InputStream inputStream, String prefix) {
        new Thread(() -> {
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            while (scanner.hasNextLine()) {
                synchronized (this) {
                    log(prefix + scanner.nextLine());
                }
            }
            scanner.close();
        }).start();
    }
    
    private static SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss:SSS");
    
    private synchronized void log(String message) {
        System.out.println(format.format(new Date()) + ": " + message);
    }


    
    // public static int sumOfArray(int[] array) {
    //     int x = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         x += array[i];

    //     }
    //     return x;
    // }

}