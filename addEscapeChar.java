








public class addEscapeChar {
    public static void main(String[] args) {
        
       String input ="<command name=\"machinestatus\"/>";

            for (int i = 0; i < input.length(); i++) {
                // System.out.println(i);
                // System.out.println(input);
                if (input.charAt(i) == '"') {
                    i++;
                    input = input.substring(0, i-1) + '\\' + input.substring(i-1);
                }
            }
            System.out.println(input);
        }
    }

