package test;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        int count = 0;

        for (int i = 0; i < 99999; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 성적 입력");
            System.out.println("2. 성적 출력");
            System.out.println("3. 종료");
            String inputmenu = sc.nextLine();

            if(inputmenu.equals("3")){
                break;
            }else if(inputmenu.equals("1")){
                if (count >= students.length) {
                    System.out.println("최대 학생 수 초과.");
                    break;
                }
                System.out.println("이름 입력: ");
                String name = sc.nextLine();
                System.out.println("성적 입력: ");
                int totalScore = Integer.parseInt(sc.nextLine());
                students[count++] = new Student(name, totalScore);
                System.out.println("성적이 입력됨.");

            }else if(inputmenu.equals("2")){
                if (count == 0) {
                    System.out.println("입력된 데이터가없음");
                }
                System.out.println("※성적출력※");

                for (int j = 0; j < count; j++) {
                    System.out.println(students[j].getName() + ":" + students[j].getScore());
                }
            }else {
                System.out.println("잘못된 입력");
            }
        }
    }
}