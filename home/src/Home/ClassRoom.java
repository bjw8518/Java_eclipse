package Home;

import java.util.Scanner;

// 1학년 내 클래스
public class ClassRoom {
    Scanner scanner = new Scanner(System.in);
    int name = 0; // A, B, C
    Student[] student = new Student[100];
    Student student1 = new Student();
    MainClass mainclass = new MainClass();
    int indexStudentA = 0, indexStudentB = 0, indexStudentC = 0;
    int count = 0;
    int len = 0;

    int sumM = 0, sumK = 0, sumE = 0, sumM2 = 0, sumE2 = 0, sumK2 = 0;
    double avgM = 0, avgK = 0, avgE = 0, avgM2 = 0, avgE2, avgK2 = 0;
    int score = 0;

    // 메소드
    public void inputClass(int index, int roomNum) {
        student[index] = new Student();

        this.name = roomNum;
        student[index].inputStudent();

        if (roomNum == 0) {
            indexStudentA++;
        } else if (roomNum == 1) {
            indexStudentB++;
        } else if (roomNum == 2) {
            indexStudentC++;
        }

    }

    public void calClass(int j) {
//		학급별 학생수 카운트

//		학급별 총 학생수
        if (this.indexStudentA != 0 || j == 0) {
            System.out.println("A반의 총 학생수 : " + this.indexStudentA);
        }
        if (this.indexStudentB != 0 || j == 1) {
            System.out.println("B반의 총 학생수 : " + this.indexStudentB);
        }
        if (this.indexStudentC != 0 || j == 2) {
            System.out.println("C반의 총 학생수 : " + this.indexStudentC);
        }

    }

    public void infoClass(int index, int j) {
//		학급별 인적사항


        if (j == 0) {
            len = indexStudentA;
        } else if (j == 1) {
            len = indexStudentB;
        } else if (j == 2) {
            len = indexStudentC;
        }

        if (this.len != 0 || this.name == 0) {
            for (int i = 0; i < index; i++) {
                if (student[i] == null) {
                    continue;
                } else {
                    this.student[i].outputStudent(i);
                    System.out.println();
                    j=j;

                }
            }
        }

    }


    public void outputClass2(int j) {

        this.student[j].outputStudent(j);

    }

    public void outputClass3(int index, int room) {

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                len = indexStudentA;
            } else if (i == 1) {
                len = indexStudentB;
            } else if (i == 2) {
                len = indexStudentC;
            }

            if (len != 0 || this.name == 0) {
                for (int j = 0; j < index; j++) {
                    if (student[j] == null) {
                        continue;
                    } else {
//					this.student[j].outputStudent3(j, room);
                        System.out.println();

                        this.sumK = sumK + student[j].test[0].korScore;
                        this.sumK2 = sumK2 + student[j].test[1].korScore;

                        this.sumE = sumE + student[j].test[0].engScore;
                        this.sumE2 = sumE2 + student[j].test[1].engScore;

                        this.sumM = sumM + student[j].test[0].mathScore;
                        this.sumM2 = sumM2 + student[j].test[1].mathScore;

                        System.out.print(j + 1 + " 번 학생 국어점수 (중간) :" + student[j].test[0].korScore + "  (기말) : "
                                + student[j].test[1].korScore + " * ");
                        System.out.print("영어점수 (중간) :" + student[j].test[0].engScore + "  (기말) : "
                                + student[j].test[1].engScore + " * ");
                        System.out.print("수학점수 (중간) :" + student[j].test[0].mathScore + " (기말) : "
                                + student[j].test[1].mathScore);
                    }

                }
                if (len == 0) {
                    System.out.println("입력된 학생이 없습니다.");
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.print("국어점수 중간고사 총점 :" + this.sumK + "  ");
                    System.out.print("영어점수 중간고사 총점 :" + this.sumE + "  ");
                    System.out.print("수학점수 중간고사 총점 :" + this.sumM + "  ");
                    System.out.println();
                    System.out.print("국어점수 기말고사 총점 :" + this.sumK2 + "  ");
                    System.out.print("영어점수 기말고사 총점 :" + this.sumE2 + "  ");
                    System.out.print("수학점수 기말고사 총점 :" + this.sumM2 + "  ");
                    System.out.println();

                    if (room == 0) {
                        len = indexStudentA;
                    } else if (room == 1) {
                        len = indexStudentB;
                    } else if (room == 2) {
                        len = indexStudentC;
                    }
                    System.out.println();

                    avgK = (double) this.sumK / len;
                    avgK2 = (double) this.sumK2 / len;
                    avgE = (double) this.sumE / len;
                    avgE2 = (double) this.sumE2 / len;
                    avgM = (double) this.sumM / len;
                    avgM2 = (double) this.sumM2 / len;

                    System.out.print("국어점수 중간고사 평균 :" + avgK + "  ");
                    System.out.print("영어점수 중간고사 평균 :" + avgE + "  ");
                    System.out.print("수학점수 중간고사 평균 :" + avgM + "  ");
                    System.out.println();
                    System.out.print("국어점수 기말고사 평균 :" + avgK2 + "  ");
                    System.out.print("영어점수 기말고사 평균 :" + avgE2 + "  ");
                    System.out.print("수학점수 기말고사 평균 :" + avgM2 + "  ");
                    System.out.println();
                    System.out.println();

                }
                break;
            }

        }
    }
}
