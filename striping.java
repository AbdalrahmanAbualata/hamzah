import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class striping {
    public static void main(String[] args) {

  char[][] abd = {{'ي','ى'},{'ة','ه'}};


String str = "ربيعة";

for (int i = 0; i < abd.length; i++) {

   str = str.replace(abd[i][0], abd[i][1]);
}

JOptionPane.showMessageDialog(null, str);


// print(str);

}

// private static void print(String msg, Object... args) {
//   try {
//       PrintStream ps = new PrintStream(System.out, true, "UTF8");
//       ps.println(String.format("عبد", args));
//   } catch (UnsupportedEncodingException error) {
//       System.err.println(error);
//       System.exit(0);
//   }
// }
}
