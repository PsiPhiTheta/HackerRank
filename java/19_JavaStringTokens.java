import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.replaceAll("[^A-Za-z]+", " ");
        s = s.trim();
        
        String[] arr = s.split(" ");    
    
        if (s == "") {
            System.out.println("0");
        }
        else if (s == null || s.trim().equals("")) {
           System.out.println("0");
        }
        else if (s.length() > 400000) {
            return;
        }
        else {
            System.out.println(arr.length);
            for (String s2 : arr) {
                System.out.println(s2);
            }
        }
        
        scan.close();
    }
}


