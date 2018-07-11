import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		BitSet[] BS = new BitSet[3];
		for (int i = 1; i < BS.length; i++) {
			BS[i] = new BitSet(a);
		}
		for (int i = 0; i < b; i++) {
			String operation = sc.next();
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
            
			if (operation.equals("AND")) {
				BS[input1].and(BS[input2]);
			} 
            else if (operation.equals("OR")) {
				BS[input1].or(BS[input2]);
			} 
            else if (operation.equals("XOR")) {
				BS[input1].xor(BS[input2]);
			} 
            else if (operation.equals("FLIP")) {
				BS[input1].flip(input2);
			} 
            else if (operation.equals("SET")) {
				BS[input1].set(input2);
			}

			System.out.println(BS[1].cardinality() + " " + BS[2].cardinality());
		}

		sc.close();
    }
}
