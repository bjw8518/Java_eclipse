package test;

import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력하세요");
        int haveMoney = sc.nextInt();
        int item_1 = 1000;
        int item_2 = 5000;
        int item_3 = 10000;
        int item_4 = 30000;
        int item_5 = 50000;
        int item_6 = 100000;
        int item_7 = 500000;
        int nomoney = 900;

        if (haveMoney <= nomoney ){
            System.out.println("거지");

        } else if (haveMoney <= item_1) {
            System.out.println("천원짜리 다이소 집게");

        } else if (haveMoney <= item_2) {
            System.out.println("오천원짜리 편의점도시락");

        }  else if (haveMoney <= item_3) {
            System.out.println("1만원짜리 4캔만원 맥주");

        }  else if (haveMoney <= item_4) {
            System.out.println("3만원짜리 도미노피자");

        }  else if (haveMoney <= item_5) {
            System.out.println("5만원짜리 신세계 상품권");
        }  else if (haveMoney <= item_6) {
            System.out.println("10만원짜리 마장동 한우 1++");
        }  else if (haveMoney <= item_7) {
            System.out.println("10만원짜리 마장동 한우 1++");
        }   else if (haveMoney <= item_7) {
            System.out.println("50만원짜리 소니 헤드폰");
        } else {
            System.out.println("많은돈");
        }


    }
}
