import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static void decentNumber(int n) {
        StringBuilder output = new StringBuilder("");

        int threes = 0;
        int fives = 0;

        while(n > 0) {
            if(n % 3 == 0) {
                while(n > 0) {
                    fives++;
                    n -= 3;
                }
            }
            else if(n % 5 == 0) {
                threes++;
                n -= 5;
            }
            else {
                fives++;
                n -= 3;
            }
        }

        if(n < 0) {
            output.append("-1");
        }
        else {
            for(int i = 0; i < fives; i++) {
                output.append("555");
            }
            for(int i = 0; i < threes; i++) {
                output.append("33333");
            }
        }
        
        System.out.println(output);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                decentNumber(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
