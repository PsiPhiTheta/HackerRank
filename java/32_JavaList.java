import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        LinkedList<Integer> L = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
			int item = scan.nextInt();
			L.add(item);
		}
        
        int Q = scan.nextInt();
        
		for (int i = 0; i < Q; i++) {
			String command = scan.next();
			if (command.equals("Insert")) {
				int element = scan.nextInt();
				int numerand = scan.nextInt();
				L.add(element, numerand);
			} 
            else if (command.equals("Delete")){
				int element = scan.nextInt();
				L.remove(element);
			}
		}
        
        scan.close();
        
		for(int num : L){ //enhanced for loop
            System.out.print(num+" ");
        } 
    }
}
