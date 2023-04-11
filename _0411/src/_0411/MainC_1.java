package _0411;
import java.util.Arrays;
import java.util.Scanner;
//권재은  ,강서영
public class MainC_1 {

    public static void main(String[] args) {
        MainC_2[] name = { new MainC_2("1"), new MainC_2("2"), new MainC_2("3") };
        MainC_3[] mains = new MainC_3[name.length];
        for (int i = 0; i < name.length; i++) {
            mains[i] = new MainC_3();
        }

        for (int i = 0; i < 99999; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("몇 반을 선택할까요?");
            System.out.println("1번 : A반 |2번 :  B반 |3번 :  C반");
            String userInput = scanner.nextLine();
            if (userInput.equals(name[0].className)) {
                mains[0].main();
            } else if (userInput.equals(name[1].className)) {
                mains[1].main();
            } else if (userInput.equals(name[2].className)) {
                mains[2].main();
            } else {
                System.out.println("올바른 학급 정보를 입력해주세요.");
                continue;
            }
        }
    }
}