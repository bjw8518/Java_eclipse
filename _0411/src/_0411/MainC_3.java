package _0411;
import java.util.Scanner;
//조재윤, 김숭림
public class MainC_3 {

    public static void main() {
//		MainC_4 main4 = new MainC_4();
        System.out.println("학급 인원 수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int userNum = Integer.parseInt(scanner.next());
        System.out.println("총원 " + userNum + "명 입니다.");
        MainC_4[] classNum = new MainC_4[userNum];

        for (int k = 0; k < userNum; k++) {
            classNum[k] = new MainC_4();
        }
        int index = 0;
        for (int i = 0; i < 999999; i++) {
            System.out.println("학적 관리 프로그램입니다.");
            System.out.println("원하시는 메뉴를 선택해주세요.");
            System.out.println("[1] 학생 정보 입력");
            System.out.println("[2] 전체 정보 확인");
            System.out.println("[3] 성적 통계 확인");
            System.out.println("[4] 지역/성별 통계 확인");
            System.out.println("[5] 종료");
            String userInput = scanner.next();
            if (userInput.equals("1")) {
                if (index >= userNum) {
                    System.out.println("학급 인원 수를 초과하였습니다.");

                } else {
                    classNum[index].nameInput();
                    classNum[index].mid_test_Input();
                    classNum[index].last_test_Input();
                    classNum[index].regionInput();
                    classNum[index].genderInput();
                    System.out.println();
                    index++;
                }
            } else if (userInput.equals("2")) {
                MainC_1 main1 = new MainC_1();

                for (int j = 0; j < index; j++) {
                    System.out.println(
                            "이름 " + classNum[j].name + " 주소 " + classNum[j].region + " 성별 " + classNum[j].gender);
                    System.out.println("중간고사 성적 : 국어 : " + classNum[j].mid_kor + " 영어 : " + classNum[j].mid_eng
                            + " 수학 : " + classNum[j].mid_math);
                    System.out.println("기말고사 성적 : 국어 : " + classNum[j].last_kor + " 영어 : " + classNum[j].last_eng
                            + " 수학 : " + classNum[j].last_math);
                }
            } else if (userInput.equals("3")) {
                System.out.println("통계 확인 창입니다.");
                System.out.println("원하시는 메뉴를 입력해주세요.");
                System.out.println("[1] : 개인 통계 | [2] : 학급통계");
                Scanner scanner03 = new Scanner(System.in);
                String number = scanner03.next();
                if (number.equals("1")) {
                    System.out.println("개인 통계를 확인합니다.");
                    System.out.println("몇 번 학생의 통계를 확인할까요?");
                    System.out.println("0~" + index);
                    int userPut = Integer.parseInt(scanner03.next());
                    if (classNum[userPut].region.equals("")) {
                        System.out.println("아직 입력하지 않은 학생을 조회하셨습니다.");
                        System.out.println("메인 화면으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        System.out.println(userPut + "번 학생의 중간고사 총점은 "
                                + (classNum[userPut].mid_kor + classNum[userPut].mid_eng + classNum[userPut].mid_math)
                                + "점");
                        System.out
                                .println(userPut
                                        + "번 학생의 중간고사 평균은 " + (double) (classNum[userPut].mid_kor
                                        + classNum[userPut].mid_eng + classNum[userPut].mid_math) / (double) 3
                                        + "점");
                        System.out.println(userPut + "번 학생의 기말고사 총점은 " + (classNum[userPut].last_kor
                                + classNum[userPut].last_eng + classNum[userPut].last_math) + "점");
                        System.out
                                .println(userPut
                                        + "번 학생의 기말고사 평균은 " + (double) (classNum[userPut].last_kor
                                        + classNum[userPut].last_eng + classNum[userPut].last_math) / (double) 3
                                        + "점");
                    }
                } else if (number.equals("2")) {
                    System.out.println("학급 통계를 확인합니다.");
                    int sumMidKor = 0, sumMidEng = 0, sumMidMath = 0, sumLastKor = 0, sumLastEng = 0, sumLastMath = 0;
                    for (int j = 0; j < index; j++) {
                        sumMidKor = sumMidKor + classNum[j].mid_kor;
                        sumMidEng = sumMidEng + classNum[j].mid_eng;
                        sumMidMath = sumMidMath + classNum[j].mid_math;
                        sumLastKor = sumLastKor + classNum[j].last_kor;
                        sumLastEng = sumLastEng + classNum[j].last_eng;
                        sumLastMath = sumLastMath + classNum[j].last_math;
                    }
                    System.out.println("중간고사 학급 국어 총점은 " + sumMidKor + "점" + " 중간고사 학급 국어 평균은 "
                            + (double) sumMidKor / (double) index + "점");
                    System.out.println("중간고사 학급 영어 총점은 " + sumMidEng + "점" + " 중간고사 학급 수학 평균은 "
                            + (double) sumMidEng / (double) index + "점");
                    System.out.println("중간고사 학급 수학 총점은 " + sumMidMath + "점" + " 중간고사 학급 영어 평균은 "
                            + (double) sumMidMath / (double) index + "점");
                    System.out.println();
                    System.out.println("기말고사 학급 국어 총점은 " + sumLastKor + "점" + " 기말고사 학급 국어 평균은 "
                            + (double) sumLastKor / (double) index + "점");
                    System.out.println("기말고사 학급 영어 총점은 " + sumLastEng + "점" + " 기말고사 학급 영어 평균은 "
                            + (double) sumLastEng / (double) index + "점");
                    System.out.println("기말고사 학급 수학 총점은 " + sumLastMath + "점" + " 기말고사 학급 수학 평균은 "
                            + (double) sumLastMath / (double) index + "점");
                }
            } else if (userInput.equals("4")) {
                System.out.println("지역/성별 통계를 확인합니다.");
                System.out.println("어떤 통계 정보를 확인하시겠습니까?");
                System.out.println("[1] : 지역 | [2] : 성별");
                String userStatics = scanner.next();
                if (userStatics.equals("1")) {
                    System.out.println("지역 통계를 확인합니다.");
                    int seoul = 0, busan = 0, gang = 0, choong = 0, jeon = 0, gyeong = 0;
                    for (int j = 0; j < index; j++) {
                        if (classNum[j].region.equals("서울")) {
                            seoul++;
                        } else if (classNum[j].region.equals("부산")) {
                            busan++;
                        } else if (classNum[j].region.equals("강원")) {
                            gang++;
                        } else if (classNum[j].region.equals("충청")) {
                            choong++;
                        } else if (classNum[j].region.equals("전라")) {
                            jeon++;
                        } else if (classNum[j].region.equals("경상")) {
                            gyeong++;
                        }
                    }
                    System.out.println("서울 거주 인원은 총 " + seoul + "명");
                    System.out.println("부산 거주 인원은 총 " + busan + "명");
                    System.out.println("강원도 거주 인원은 총 " + gang + "명");
                    System.out.println("충청도 거주 인원은 총 " + choong + "명");
                    System.out.println("전라도 거주 인원은 총 " + jeon + "명");
                    System.out.println("경상도 거주 인원은 총 " + gyeong + "명");
                } else if (userStatics.equals("2")) {
                    System.out.println("성별 통계를 확인합니다.");
                    int male = 0, female = 0;
                    for (int j = 0; j < index; j++) {
                        if (classNum[j].gender.equals("남")) {
                            male++;
                        } else {
                            female++;
                        }
                    }
                    System.out.println("남성은 총 " + male + "명");
                    System.out.println("여성은 총 " + female + "명");
                } else {
                    System.out.println("올바른 정보를 입력해주세요.");
                }
            } else if (userInput.equals("5")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}