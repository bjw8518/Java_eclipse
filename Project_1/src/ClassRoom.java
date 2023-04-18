//test[0]중간
//test[1]기말
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClassRoom {
    String name;
    Student[] student = new Student[100];   //100명까지
    int index = 0;
    int middleScoreTotal = 0;
    int finalScoreTotal = 0;



    ClassRoom(String name) {    //생성자
        this.name = name;   //같은 name이 아님, 같은역활을 하기때문에 같은이름을 쓴것
    }

    //학생들 추가
    public void addStudent() {
        System.out.println("추가 할 학생 정보 입력");
        Scanner sc = new Scanner(System.in);
        System.out.println("이름");
        String name = sc.nextLine();

        System.out.println("성별");
        String sex = sc.nextLine();

        System.out.println("주소");
        String address = sc.nextLine();

        this.student[this.index] = new Student(name, sex, address);
        index++;       //   인덱스값을 증가
    }
    //class
    public void addClass() {

    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 학생 추가");
        System.out.println("2. 학생 목록 출력");
        System.out.println("3. 시험 점수 입력");
        System.out.println("4. 시험 총점 출력");
        System.out.println("5. 중간고사 순위");
        System.out.println("6. 기말고사 순위");
        String selectMenu = scanner.nextLine();
        if (selectMenu.equals("1")) {
            this.addStudent();
        } else if (selectMenu.equals("2")) {
            this.showStudent();
        } else if (selectMenu.equals("3")) {
            this.inputScore();
        } else if (selectMenu.equals("4")) {
            this.calc();
            System.out.println("중간고사 총점 :" + this.middleScoreTotal);
            System.out.println("기말고사 총점 :" + this.finalScoreTotal);
        } else if (selectMenu.equals("5")) {
            this.middleScoreRank();
        } else {
            System.out.println("입력이 잘못 되었습니다.");
            this.showMenu();
        }
    }

    private void middleScoreRank() {
        for (int i = 0; i < this.index-1; i++) {
            for (int j = i; j < this.index; j++) {
                if(this.student[i].test[0].total>this.student[j].test[0].total){
                    Student temp = this.student[i];
                    this.student[i] = this.student[j];
                    this.student[j] = temp;
                }

            }

        }
    }


    public void calc(){
        for (int i = 0; i < this.index; i++) {
            this.middleScoreTotal = this.middleScoreTotal
                    + this.student[i].test[0].total;
            this.finalScoreTotal = this.finalScoreTotal
                    + this.student[i].test[0].total;
        }
    }

    public void showStudent() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(""+i+":"+student[i].toString());  //toString 생략가능
            //System.out.println(""+i+":"+student[i]);  //압축

        }
    }

    @Override
    public String toString() {
        return this.name + " (" + this.index + "명)";
    }

    public void inputScore() {
        this.showStudent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력을 원하는 학생 선택");
        String selectStudent = scanner.nextLine();
        int selectStudentNumber = Integer.parseInt(selectStudent);
        if (this.student[selectStudentNumber] != null) {    //빈값체크
            this.student[selectStudentNumber].showMenu();   //어디서 호출되는 메소드인가
        }
    }
}
