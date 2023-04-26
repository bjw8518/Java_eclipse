package index;

import java.util.Scanner;

public class kaup {
    double Weight=0;
    double Height=0;

    //입력
    public void inputVar(){
        System.out.println("몸무게를 입력해주세요");
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();
        System.out.println("키를 입력해주세요");
        double height = scanner.nextDouble();
        height = height / (double)100;

    }
    //계산
    public void cal(){
        double result = Weight/Height*Height;

        if (result >= 30) {
            System.out.println("비만");
        } else if (result > 24) {
            System.out.println("과체중");
        } else if (result > 20) {
            System.out.println("정상");
        } else if (result > 15) {
            System.out.println("저체중");
        } else if (result > 13) {
            System.out.println("여윔");
        } else if (result > 10) {
            System.out.println("영양 실조증");
        } else {
            System.out.println("소모증");
        }
    }
}