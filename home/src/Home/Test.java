package Home;

import java.util.Scanner;

public class Test {
    String categorie;// 기말고사, 중간고사
    int korScore;
    int engScore;
    int mathScore;
// 관리에 필요한 부분만 메소드

    //	생성자
    Test() {
        this.categorie = "점수 입력";
    }

    Scanner scanner = new Scanner(System.in);

    public void testInput(int j) {

        System.out.println("국어 점수를 입력해주세요");
        int inputNum = Integer.parseInt(scanner.nextLine());
        if(j ==0) {
            this.categorie="중간고사";
        } else if(j==1) {
            this.categorie="기말고사";
        }
        if (inputNum > 0 && inputNum <= 100) {
            this.korScore = inputNum;

        } else {
            System.out.println("오류");
            testInput(j);
        }
        System.out.println("영어 점수를 입력해주세요");
        int inputNum1 = Integer.parseInt(scanner.nextLine());
        if (inputNum1 > 0 && inputNum1 <= 100) {
            this.engScore = inputNum1;

        } else {
            System.out.println("오류");
            testInput(j);
        }

        System.out.println("수학 점수를 입력해주세요");
        int inputNum2 = Integer.parseInt(scanner.nextLine());
        if (inputNum2 > 0 && inputNum2 <= 100) {
            this.mathScore = inputNum2;

        } else {
            System.out.println("오류");
            testInput(j);
        }

    }


}
