import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        
        a = a.toUpperCase();
        char[] a_sorted = a.toCharArray();
        Arrays.sort(a_sorted);
        String a_sortedstr = new String (a_sorted);
        
        b = b.toUpperCase();
        char[] b_sorted = b.toCharArray();
        Arrays.sort(b_sorted);
        String b_sortedstr = new String (b_sorted);
        
        if (a_sortedstr.equals(b_sortedstr)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
