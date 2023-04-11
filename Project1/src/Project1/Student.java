package Project1;

import java.util.Scanner;

public class Student {
    String name;
    String addr;
    String sex;

    Test[]test =new Test[2];
    Test mid_exam_Input;
    Test final_exam_Input;

    public void name_input(){
        System.out.println("이름을 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }
    public void addr_input(){
        System.out.println("주소를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        this.addr = scanner.nextLine();
    }
    public void sex_input(){
        System.out.println("주소를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        this.sex = scanner.nextLine();
    }
}
