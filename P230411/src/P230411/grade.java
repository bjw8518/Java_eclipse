package P230411;

import java.util.Scanner;

public class grade {
    String name = "";
    int mid_kor = 0;
    int mid_eng = 0;
    int mid_math = 0;
    int final_kor = 0;
    int final_eng = 0;
    int final_math = 0;
    String region = "";
    String gender = "";

    public void name_Input() {
        System.out.println("이름을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }
    public void mid_exam_Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("중간고사 국어 성적 입력");
        this.mid_kor = Integer.parseInt(scanner.nextLine());
        System.out.println("중간고사 영어 성적 입력");
        this.mid_eng = Integer.parseInt(scanner.nextLine());
        System.out.println("중간고사 수학 성적 입력");
        this.mid_math = Integer.parseInt(scanner.nextLine());
        System.out.println();
    }
    public void final_exam_Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("기말고사 국어 성적 입력");
        this.final_kor = Integer.parseInt(scanner.nextLine());
        System.out.println("기말고사 영어 성적 입력");
        this.final_eng = Integer.parseInt(scanner.nextLine());
        System.out.println("기말고사 수학 성적 입력");
        this.final_math = Integer.parseInt(scanner.nextLine());
        System.out.println();
    }

    public void region_Input() {
        System.out.println("주소 입력");
        Scanner scanner = new Scanner(System.in);
        this.region = scanner.nextLine();
    }

    public void gender_Input() {
        System.out.println("성별을 입력해주세요");
        System.out.println("남자/여자");
        Scanner scanner = new Scanner(System.in);
        this.gender = scanner.nextLine();
    }

}
