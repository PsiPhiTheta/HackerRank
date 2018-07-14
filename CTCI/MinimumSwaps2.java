import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {
    static int minimumSwaps(int[] arr) {
        int size = arr.length;

        int [] sorted = arr.clone();
        Arrays.sort(sorted); //maybe inneficient, sorting is n log(n) - merge sort (use quick sort for outliers), missing test cases 9 to 13

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : arr) list.add(i);

        for (int i = 0; i < size; i++) {
            list.set(list.indexOf(sorted[i]), i);
        }

        int steps = 0;
        for (int i = 0; i < size; i++) {
            if (list.get(i) != i) {
                int number = list.get(i);
                int secondNumber = list.get(number);
                list.set(number, number);
                list.set(i, secondNumber);
                i--;
                steps++;
            }
        }
        return steps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
