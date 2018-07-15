import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        double [] number_arr = new double[size]; 
        for (int i = 0; i < size; i++){
            number_arr[i] = scan.nextDouble();
        }
        
        double mean = calculateMean(number_arr);
        double median = calculateMedian(number_arr);
        double mode = calculateMode(number_arr);
        
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }
    
    public static double calculateMean(double[] number_arr) {
        int size = number_arr.length;
        double result = 0.0;
        for(int i = 0; i < size; i++) {
            result += number_arr[i];
        }
        return result/size;
    }
    
    public static double calculateMedian(double[] number_arr) {
        int size = number_arr.length;
        double result = 0.0;
        Arrays.sort(number_arr);
        if(size % 2 == 0) {
            int i = size/2;
            result = (number_arr[i] + number_arr[i - 1])/2;
        } 
        else {
            int i = (size - 1)/2;
            result = number_arr[i];
        }
        return result;
    }
    
    public static double calculateMode(double[] number_arr) {
        int size = number_arr.length;
        double result = 0;
        double maxCount = 0;

        for (int i = 0; i < size; ++i) {
            int count = 0;
            for (int j = 0; j < size; ++j) {
                if (number_arr[j] == number_arr[i]){
                    count++;    
                }
            }
            if (count > maxCount) {
                maxCount = count;
                result = number_arr[i];
            }
        }
        return result;
    }
}
