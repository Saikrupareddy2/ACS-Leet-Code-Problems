
import java.time.LocalDate;

public class Solution {
    public int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);   // parse YYYY-MM-DD
        return d.getDayOfYear();               // built-in method
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.dayOfYear("2019-01-09")); // 9
        System.out.println(sol.dayOfYear("2019-02-10")); // 41
    }
}
