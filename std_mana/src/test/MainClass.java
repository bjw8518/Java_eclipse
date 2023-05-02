package test;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        ClassRoom classroom1 = new ClassRoom();
        ClassRoom[] classroom = new ClassRoom[3];
        for (int i = 0; i < classroom.length; i++) {
            classroom[i] = new ClassRoom();
        }
        Student student = new Student();

        int index = 0;
        String room = "";
        int roomNum = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 99999; i++) {
            System.out.println("원하시는 메뉴를 선택해주세요.");
            System.out.println("1. 새 학생 데이터 입력");
            System.out.println("2. 전체 목록 출력");
            System.out.println("3. 성적 통계");
            System.out.println("q. 종료");

            String menuStirng = scanner.nextLine();
            if (menuStirng.equals("q")) {
                break;
            } else if (menuStirng.equals("1")) {

//				반 입력 메소드 호출
                System.out.println("A반은 1번, B반은 2번, C반은 3번을 입력해주세요. ");
                room = scanner.nextLine();
                roomNum = Integer.parseInt(room);
                classroom[roomNum - 1].inputClass(index, roomNum - 1);
                index++;

            } else if (menuStirng.equals("2")) {
//				전체 출력
                System.out.println("**********2. 전체 목록 출력**********");
                System.out.println();
                System.out.println();

                System.out.println("=========학급별 총 학생수=========");
                for (int j = 0; j < classroom.length; j++) {
                    classroom[j].calClass(j);
                }

                System.out.println();

                System.out.println("=========학급별 인적사항=========");
                for (int j = 0; j < classroom.length; j++) {
                    if (j == 0) {
                        System.out.println("A 반");
                    } else if (j == 1) {
                        System.out.println("B 반");
                    } else if (j == 2) {
                        System.out.println("C 반");
                    }
                    classroom[j].infoClass(index, j);
                    System.out.println();

                }

//				총 학생수
                System.out.println("=========총 학생수=========");
                int sumClass = 0;
                System.out.println("전체 학생 수는 :" + index);

            } else if (menuStirng.equals("3")) {
//				성적 통계

                int sumKor = 0, sumEng = 0, sumMath = 0;
                double avgKor = 0, avgEng = 0, avgMath = 0;
                int sumEndKor = 0, sumEndEng = 0, sumEndMath = 0;
                double avgEndKor = 0, avgEndEng = 0, avgEndMath = 0;

                System.out.println("**********  3. 성적 통계	**********");

//				중간고사 학급별 + 과목별 합 + 평균

                System.out.println();

                for (int j = 0; j < classroom.length; j++) {
                    if (j == 0) {
                        System.out.println("=========A 반=========");
                    } else if (j == 1) {
                        System.out.println("=========B 반=========");
                    } else if (j == 2) {
                        System.out.println("=========C 반=========");
                    }
                    System.out.println();

                    classroom[j].outputClass3(index, j);
                    System.out.println();

                }

                continue;

            } else {
                System.out.println("잘못된 입력.");
                continue;
            }
            System.out.println();
            System.out.println();
        }

    }
}
