import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        int sleng = A.length();
        String substring1 = "";
        String substring2_rev = "";
        StringBuilder substring2build = new StringBuilder();
        String substring2 = "";
        
        if (sleng % 2 == 0) {
            substring1 = A.substring(0, sleng/2);
            substring2_rev = A.substring(sleng/2, sleng);
            substring2build.append(substring2_rev);
            substring2 = substring2build.reverse().toString();
        }
        else {
            substring1 = A.substring(0, (sleng + 1)/2);
            substring2_rev = A.substring((sleng + 1)/2 -1, sleng);
            substring2build.append(substring2_rev);
            substring2 = substring2build.reverse().toString();
        }
        
        if (substring1.equals(substring2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
