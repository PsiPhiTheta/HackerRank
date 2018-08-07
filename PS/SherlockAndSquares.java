import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {
    
    static int squares(int a, int b) {
        int count = 0;
        double root_a = Math.sqrt(a);
        int root_a_int = (int)root_a;
        int root_a_int_sq = root_a_int * root_a_int;
        while (root_a_int_sq <= b) {
            if (root_a_int_sq >= a) {
                count++;
            }
            root_a_int++;
            root_a_int_sq = root_a_int * root_a_int;
        }
        return count;  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
