import java.io.*;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();
        
        BigInteger a_numBig = new BigInteger(a);
        BigInteger b_numBig = new BigInteger(b);
        
        BigInteger result_sum =  BigInteger.valueOf(0);
        result_sum = result_sum.add(a_numBig);
        result_sum = result_sum.add(b_numBig);
        BigInteger result_mul =  a_numBig.multiply(b_numBig); 
        
        System.out.println(result_sum);
        System.out.println(result_mul);
    }
}
