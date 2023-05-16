package com.bjw;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Student[] student = {
                new Student("홍길동",100),
                new Student("둘리",10),
                new Student("도우너",30),
                new Student("또치",50),
                new Student("희동이",100),
                new Student("마이콜",20),
                new Student("이순신",100),
                new Student("이성계",50),
                new Student("강감찬",80),
                new Student("궁예",10),
                new Student("허준",90),
                new Student("박혁거세",70),
                new Student("하니",30),
                new Student("나예리",70),
                new Student("고길동",80),
                new Student("비실이",60),
                new Student("이가영",70),
                new Student("이기철",40),
                new Student("노진구",50),
                new Student("퉁퉁이",60),
        };

        ArrayList<ClassRoom> classRoom = new ArrayList<ClassRoom>();
        classRoom.add(new ClassRoom("A반"));
        classRoom.add(new ClassRoom("B반"));
        classRoom.add(new ClassRoom("C반"));

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 999999; i++) {
            System.out.println("1. 학생 선택");
            System.out.println("q. 종료");
            String selectMenu = scanner.nextLine();
            if (selectMenu.equals("1")) {
                for (int j = 0; j < student.length; j++) {
                    System.out.println("" + j + " : " + student[j]);
                }
                System.out.println("학생 번호 : ");
                String selectStudent = scanner.nextLine();
                int selectStudentNumber = Integer.parseInt(selectStudent);

                for (int j = 0; j < classRoom.size(); j++) {
                    System.out.println("" + j + " : " + classRoom.get(j));
                }
                System.out.println("반 번호 : ");
                String selectClassRoom = scanner.nextLine();
                int selectClassRoomNumber = Integer.parseInt(selectClassRoom);

                ClassRoom sClassRoom = classRoom.get(selectClassRoomNumber);
                Student sStudent = student[selectStudentNumber];
                sClassRoom.students.add(sStudent);
            } else if (selectMenu.equals("q")) {
                break;
            }
        }
    }
}