import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {

    static int findDigits(int n) {
        int count = 0;
        
        String n_string = Integer.toString(n);
        int[] n_array = new int[n_string.length()];
        for (int i = 0; i < n_string.length(); i++)
        {
            n_array[i] = n_string.charAt(i) - '0';
            if (n_array[i] == 0) {
                count += 0;
            }
            else if (n % n_array[i] == 0) {
                count++;
            }
        }
            
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
