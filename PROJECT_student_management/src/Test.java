import java.util.Scanner;

public class Test {
    String name;
    int kor;
    int eng;
    int math;
    int total;  //총점수

    Test(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total =kor+eng+math;
    }
    Test(String name){
        this.name = name;

    }

    public void inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어 점수 : ");
        String inputScore = scanner.nextLine();
        this.kor = Integer.parseInt(inputScore);
        System.out.println("영어 점수 : ");
        inputScore = scanner.nextLine();
        this.eng = Integer.parseInt(inputScore);
        System.out.println("수학 점수 : ");
        inputScore = scanner.nextLine();
        this.math = Integer.parseInt(inputScore);
        this.total = this.kor + this.eng + this.math;
    }
}