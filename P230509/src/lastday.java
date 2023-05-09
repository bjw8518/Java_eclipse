import java.time.YearMonth;

public class lastday {
    public static void main(String[] args) {
        int year = 2023;
        int month = 5;

        YearMonth yearMonth = YearMonth.of(year, month);
        int lastDay = yearMonth.lengthOfMonth();

        System.out.println(year + "년 " + month + "월의 마지막 날짜는 " + lastDay + "일입니다.");
    }
}