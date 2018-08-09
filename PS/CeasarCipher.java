import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        int shift = k%26;   
        StringBuilder s_encrypted = new StringBuilder("");
        
        for(char letter : s.toCharArray())
        {
            if(letter > 96 && letter < 123)
            {
                char encrypted = (char) (letter+shift);
                if(encrypted > 122)
                {
                    encrypted = (char) ((encrypted % 122) + 96);
                }
                s_encrypted.append(encrypted);
            }
            else if(letter > 64 && letter < 91)
            {
                char encrypted = (char) (letter+shift);
                if(encrypted > 90)
                {
                    encrypted = (char) ((encrypted % 90) + 64);
                }
                s_encrypted.append(encrypted);
            }
            else {
                s_encrypted.append(letter);
            }
        }
        
        return s_encrypted.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
