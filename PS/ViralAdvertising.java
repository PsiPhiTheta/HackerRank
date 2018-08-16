import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {

    static int viralAdvertising(int n) {
        int total_liked = 0;
        int last_liked = 0;
        if (n == 0) {
            total_liked = 0;
        }
        else if (n == 1) {
            total_liked = n/2;
        }
        else {
            last_liked = 2;
            total_liked = 2;
            for (int i = 1; i<n; i++) {
                last_liked = 3*last_liked/2;
                total_liked += last_liked;
            }
        }
        return total_liked;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
