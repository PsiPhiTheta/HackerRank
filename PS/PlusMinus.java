import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {

    static void plusMinus(int[] arr) {
        double pos = 0;
        double frac_pos = 0;
        double neg = 0;
        double frac_neg = 0;
        double zer = 0;
        double frac_zer = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            }
            if (arr[i] < 0) {
                neg++;
            }
            if (arr[i] == 0) {
                zer++;
            }
        }
        
        frac_pos = pos/arr.length;
        System.out.println(frac_pos);
        frac_neg = neg/arr.length;
        System.out.println(frac_neg);
        frac_zer = zer/arr.length;
        System.out.println(frac_zer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
