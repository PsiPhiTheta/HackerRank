import java.io.*;
import java.math.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int b_charged = 0;
        int b_actual = 0;
        int difference = 0;
        int total = 0;
        
        b_charged = b;
        
        for(int i = 0; i < bill.size(); i++) {
            total += bill.get(i);
        }
        b_actual = (total - bill.get(k))/2;

        if (b_charged == b_actual) {
            System.out.println("Bon Appetit");
        }
        else {
            difference = b_charged - b_actual;
            System.out.println(difference);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
