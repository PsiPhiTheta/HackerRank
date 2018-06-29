import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        while(sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(count + " " + str);
            count++;
        }
    }
}
