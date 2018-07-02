import java.util.Scanner;
import java.time.LocalDate;

class Solution {
	public static String getDay(String day, String month, String year){
    int dd = Integer.parseInt(day);
    int mm = Integer.parseInt(month);
    int yyyy = Integer.parseInt(year);
    LocalDate dt = LocalDate.of(yyyy, mm, dd); 
    String ans = dt.getDayOfWeek().toString();
    return ans;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
