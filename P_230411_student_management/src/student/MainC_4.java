package student;

import java.util.Scanner;
//배진우
public class MainC_4 {

    String name = "";
    int mid_kor = 0;
    int mid_eng = 0;
    int mid_math = 0;
    int last_kor = 0;
    int last_eng = 0;
    int last_math = 0;
    String region = "";
    String gender = "";

    public void nameInput() {
        System.out.println("이름을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }

    public void mid_test_Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("중간고사 국어 성적을 입력해주세요.");
        this.mid_kor = Integer.parseInt(scanner.nextLine());
        System.out.println("중간고사 영어 성적을 입력해주세요.");
        this.mid_eng = Integer.parseInt(scanner.nextLine());
        System.out.println("중간고사 수학 성적을 입력해주세요.");
        this.mid_math = Integer.parseInt(scanner.nextLine());
        System.out.println();
    }

    public void last_test_Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("기말고사 국어 성적을 입력해주세요.");
        this.last_kor = Integer.parseInt(scanner.nextLine());
        System.out.println("기말고사 영어 성적을 입력해주세요.");
        this.last_eng = Integer.parseInt(scanner.nextLine());
        System.out.println("기말고사 수학 성적을 입력해주세요.");
        this.last_math = Integer.parseInt(scanner.nextLine());
        System.out.println();
    }

    public void regionInput() {
        System.out.println("거주 지역 정보를 입력해주세요.");
        System.out.println("서울|부산|강원|충청|전라|경상");
        Scanner scanner = new Scanner(System.in);
        String regionInfo = scanner.nextLine();
        if (regionInfo.equals("서울") || regionInfo.equals("부산") || regionInfo.equals("강원") || regionInfo.equals("충청")
                || regionInfo.equals("전라") || regionInfo.equals("경상")) {
            this.region = regionInfo;
        } else {
            System.out.println("올바른 지역명을 입력해주세요.");
            regionInput();
        }
    }

    public void genderInput() {
        System.out.println("성별을 입력해주세요");
        System.out.println("남|여");
        Scanner scanner = new Scanner(System.in);
        String genderInfo = scanner.nextLine();
        if (genderInfo.equals("남") || genderInfo.equals("여")) {
            this.gender = genderInfo;
        } else {
            System.out.println("올바른 값을 입력해주세요.");
        }

    }

}
