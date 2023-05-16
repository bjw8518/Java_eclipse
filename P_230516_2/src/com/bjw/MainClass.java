package com.bjw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<Student>();
        for (int i = 0; i < 9999999; i++) {
            System.out.println("1. 데이터 입력");
            System.out.println("2. 전체 데이터 출력");
            System.out.println("3. 최고 성적자 출력");
            System.out.println("q. 종료");
            String menuSelect = scanner.nextLine();
            if (menuSelect.equals("1")) {
//				// 1
//				Student item = new Student();
//				item.inputData();
//				student.add(item);

                // 2
//				Scanner scanner = new Scanner(System.in);
//				System.out.println("name : ");
//				String tmp = scanner.nextLine();
//				String name = tmp;
//				System.out.println("score : ");
//				tmp = scanner.nextLine();
//				int score = Integer.parseInt(tmp);
//				student.add(new Student(name, score));

                // 3
                student.add(new Student(true));
            } else if (menuSelect.equals("2")) {
                for (int j = 0; j < student.size(); j++) {
                    System.out.println(student.get(j));
                }
            } else if (menuSelect.equals("3")) {
                int maxScore = -1;
                for (int j = 0; j < student.size(); j++) {
                    if (student.get(j).score > maxScore) {
                        maxScore = student.get(j).score;
                    }
                }
                for (int j = 0; j < student.size(); j++) {
                    if (student.get(j).score == maxScore) {
                        System.out.println(student.get(j));
                    }
                }

                // Collections.sort()
                Collections.sort(student, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;
                    }
                });

                // selection, bubble
                // ArrayList -> Array  "java arraylist to array"
                Student[] tmp = student.toArray(new Student[student.size()]);
                // sort
                for (int i1 = 0; i1 < tmp.length - 1; i1++) {
                    for (int i2 = i1 + 1; i2 < tmp.length; i2++) {
                        if (tmp[i1].score < tmp[i2].score) {
                            Student t1 = tmp[i1];
                            tmp[i1] = tmp[i2];
                            tmp[i2] = t1;
                        }
                    }
                }
                // Array -> ArrayList
                student = (ArrayList<Student>) Arrays.asList(tmp);
            } else if (menuSelect.equals("q")) {
                break;
            }
        }
    }
}