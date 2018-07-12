import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {

    static void minimumBribes(int[] q) {
        int count = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i]-(i+1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            else {
                for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                    if (q[j] > q[i]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
