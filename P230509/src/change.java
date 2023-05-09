import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class change {
    public static void main(String[] args) throws ParseException {

        // 문자열
        String dateStr = "2023년 05월 09일 10시 14분 00초";

        // 포맷터
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");

        // 문자열 -> Date
        Date date = formatter.parse(dateStr);

        System.out.println(date); // Sat Jun 19 21:05:07 KST 2021
    }
}