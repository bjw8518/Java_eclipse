import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class datecalculator {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2023, 5, 9, 12, 0, 0); // 첫 번째 날짜/시간
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 5, 10, 12, 0, 0); // 두 번째 날짜/시간

        Duration duration = Duration.between(dateTime1, dateTime2); // 두 날짜/시간의 차이 계산
        long seconds = duration.getSeconds(); // 차이를 초 단위로 변환

        System.out.println("첫 번째 날짜/시간: " + dateTime1);
        System.out.println("두 번째 날짜/시간: " + dateTime2);
        System.out.println("두 날짜/시간의 차이: " + seconds + "초");

        long days = ChronoUnit.DAYS.between(dateTime1, dateTime2); // 두 날짜 사이의 일수 계산
        System.out.println("두 날짜의 차이: " + days + "일");
    }
}