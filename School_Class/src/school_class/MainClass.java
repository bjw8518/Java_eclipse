package school_class;

import java.util.Scanner;

//	조원별 클래스 한개씩 - 조장이 클래스 만드는거 관리
//	제출할 때 클래스에 작성자 이름 명시
//
//성적 관리
//1학년 각 클래스 별 성적 관리(중간고사, 기말고사)
//각 시험은 국어, 영어, 수학 총 3과목
//
//클래스 객체 (A반, B반, C반)
//학생 객체(이름, 주소, 성별)
//시험 객체(중간고사, 기말고사)
//
//입력가능, 전체 목록 출력, 통계(총점, 평균 등)
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<999;i++){


            System.out.println("원하는메뉴선택하세요");
            System.out.println("[1] 데이터입력");
            System.out.println("[2] 전체목록 출력");
            System.out.println("[3] 통계(총점 및 평균)");
            System.out.println("[q] 종료");

            String menuStirng = scanner.nextLine();
            if (menuStirng.equals("q")) {
                break;
            } else if (menuStirng.equals("1")) {
                //student[index].inputData();
                //    index++;
            } else if (menuStirng.equals("2")) {
                //
            } else if (menuStirng.equals("3")) {
                //통계

                System.out.println("통계");
            } else {
                System.out.println("잘못된입력");
            }
            System.out.println();
            System.out.println();
        }
    }
}
