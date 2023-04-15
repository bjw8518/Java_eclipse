package Home;

import java.util.Scanner;

public class Student {
    String name;
    String address;
    String sex;
    Test[] test = new Test[2];
    Test test1 = new Test();


    Scanner scanner = new Scanner(System.in);

    public void inputStudent() {
// 	메소드
        for (int i = 0; i < test.length; i++) {
            test[i] = new Test();
        }

        System.out.println("이름을 입력해주세요");
        this.name = scanner.nextLine();
        System.out.println("주소를 입력해주세요");
        this.address = scanner.nextLine();
        System.out.println("성별을 입력해주세요"); //boolean
        this.sex = scanner.nextLine();

        System.out.println("성적 입력 - 중간고사 성적. 기말고사 성적.");

        System.out.println("중간 고사");
        test[0].testInput(0);

        System.out.println("기말 고사");
        test[1].testInput(1);

    }

    public void outputStudent(int j) {

        System.out.print(j + 1 + " 번 학생 이름 :" + this.name + "   주소 : " + this.address + "   성별 : " + this.sex + "  ");

    }


}
