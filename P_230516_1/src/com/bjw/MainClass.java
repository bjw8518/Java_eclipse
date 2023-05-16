package com.bjw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 99999; i++) {
            System.out.println("1. 성적 입력");
            System.out.println("2. 성적 출력");
            System.out.println("3. 종료");
            String inputmenu = sc.nextLine();

            if (inputmenu.equals("3")) {
                break;
            } else if (inputmenu.equals("1")) {
                System.out.println("이름 입력: ");
                String name = sc.nextLine();
                System.out.println("성적 입력: ");
                int totalScore = Integer.parseInt(sc.nextLine());
                students.add(new Student(name, totalScore));
                System.out.println("성적이 입력됨.");

            } else if (inputmenu.equals("2")) {
                if (students.isEmpty()) {
                    System.out.println("입력된 데이터가 없음");
                } else {
                    System.out.println("※성적 출력※");
//                    for (int j = 0; j < students.size(); j++) {
//                        Student student = students.get(j);
//                        System.out.println(student.getName() + ": " + student.getScore());
//
                }
            } else {
                System.out.println("잘못된 입력");
            }
        }
    }
}