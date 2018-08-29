import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    static int[] gradingStudents(int[] grades) {
        for (int i = 0; i<grades.length; i++) {
            if (grades[i] < 38) {
                grades[i] = grades[i];
            }
            else if ((grades[i]%5) > 2) {
                if ((grades[i]%5) > 3) {
                    grades[i]++;
                }
                else {
                    grades[i] += 2;
                }
            }
            else {
                grades[i] = grades[i];
            }
        }
        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
