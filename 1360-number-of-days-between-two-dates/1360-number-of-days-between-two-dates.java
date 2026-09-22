import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);   // parse YYYY-MM-DD
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.daysBetweenDates("2019-06-29", "2019-06-30")); // 1
        System.out.println(sol.daysBetweenDates("2020-01-15", "2019-12-31")); // 15
    }
}

