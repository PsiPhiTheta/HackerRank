import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Solution {

    static String timeConversion(String s) {
        String time = s;
        
        String [] time_arr = time.split(":");
        String sec = time_arr[2].substring(0, 2);
        String min = time_arr[1];
        String hrs = time_arr[0];
            
        String am_pm = time_arr[2].substring(2,4);
        
        String new_hrs = "void";
        
        if (am_pm.equals("PM")) {
            new_hrs = Integer.toString(Integer.parseInt(hrs) + 12);
            if (Integer.parseInt(hrs) == 12) {
            new_hrs = "12";
            }
        }
        else {
            new_hrs = hrs;
            if (Integer.parseInt(hrs) == 12) {
            new_hrs = "00";
            }  
        }
        String result = new_hrs + ":" + min + ":" + sec;
        return result;
    }                 

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
