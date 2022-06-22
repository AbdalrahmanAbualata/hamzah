// import org.apache.commons.net.telnet.*;
// import org.apache.commons.net.io.Util;
// import java.io.InputStream;
// import java.io.OutputStream;
// import java.io.IOException;

// public class abd {
//     public static void main(String[] args) {
//         TelnetClient telnet;
		  
// 		      telnet = new TelnetClient();
		  
// 		          try
// 		 	          {
// 		             telnet.connect("rainmaker.wunderground.com", 3000);
// 		          }
// 		         catch (IOException e)
// 		            {
		    
// 		        	 e.printStackTrace();
// 		             System.exit(1);
// 		         }
		  
// 		         IOUtil.readWrite(telnet.getInputStream(), telnet.getOutputStream(),
// 		                           System.in, System.out);
		  
// 		          try
// 		  	          {
// 		              telnet.disconnect();
// 		          }
// 		          catch (IOException e)
// 		  	          {
// 		             e.printStackTrace();
// 		             System.exit(1);
// 		          }
		  
// 		          System.exit(0);
//     }
// }
