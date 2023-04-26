import java.util.Scanner;

public class Student {
    String name;
    String sex;
    String address;
    Test[]test = {  //테스트배열안에 "중간고사", "기말고사"
            new Test("중간고사"),
            new Test("기말고사")
    };

    Student(String name){
        this.name=name;
    }
    Student(String name,String sex,String address){
        this.name=name;
        this.sex=sex;
        this.address=address;
    }
    public String toString() {
        return this.name + " (" + this.sex + ", " + this.address + ")";
    }
    public void showMenu() {    //메뉴로 뺌
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.test.length; i++) {    //length  = 2
            System.out.println("" + i + " : " + this.test[i].name); //중간고사,기말고사
        }
        System.out.println("입력을 원하는 시험을 선택해주세요.");
        String selectTest = scanner.nextLine();
        int selectTestNumber = Integer.parseInt(selectTest);
        this.test[selectTestNumber].inputScore();
    }
}