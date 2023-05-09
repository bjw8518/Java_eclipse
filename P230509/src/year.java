import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class year {
    public static void main(String[] args) {
        String dateStr = "2023-05-09";
        LocalDate date = LocalDate.parse(dateStr);

        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();

        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        System.out.println("년도: " + year);
        System.out.println("월: " + month);
        System.out.println("일: " + dayOfMonth);
        System.out.println("요일: " + dayOfWeek);
    }
}