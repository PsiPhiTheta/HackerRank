import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {

    static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.valueOf(n);
        
        for (int i = (n - 1); i > 0; i--) {
            result = result.multiply((BigInteger.valueOf(i)));
        }
        
        System.out.println(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
