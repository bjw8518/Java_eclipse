package Project1;

import java.util.Scanner;

public class Test {
    String category;//중간,기말
    int korScore;
    int engScore;
    int mathScore;

    public void mid_exam_Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("중간고사 국어 성적 입력");
        this.korScore = Integer.parseInt(scanner.nextLine());
        System.out.println("중간고사 영어 성적 입력");
        this.engScore = Integer.parseInt(scanner.nextLine());
        System.out.println("중간고사 수학 성적 입력");
        this.mathScore = Integer.parseInt(scanner.nextLine());
        System.out.println();
    }
    public void final_exam_Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("기말고사 국어 성적 입력");
        this.korScore = Integer.parseInt(scanner.nextLine());
        System.out.println("기말고사 영어 성적 입력");
        this.engScore = Integer.parseInt(scanner.nextLine());
        System.out.println("기말고사 수학 성적 입력");
        this.mathScore = Integer.parseInt(scanner.nextLine());
        System.out.println();
    }
}
