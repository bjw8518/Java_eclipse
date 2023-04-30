package test;

import java.util.Random;
import java.util.Scanner;

public class sc {
    public static void main(String[] args) {
        //스캐너
        System.out.println("화면에 숫자입력");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //int를 입력 받을 때는 nextInt 메서드를 이용한다.
        int n1 = sc.nextInt();
        int n2 = sc2.nextInt();
        int result = n1+n2;

        System.out.println("-------------------------------------------");

        System.out.println("1번"+n1);
        System.out.println("2번"+n2);
        System.out.println(result);

        System.out.println("-------------------------------------------");

        //증감연산
        int val;
        val = 10;
        System.out.println(val);

        //val의 1을 더하는 연산을 먼저
        System.out.println(val);//  10
        System.out.println(++val);//11
        System.out.println(val);//  11

        //10을출력하고나서 1을 더함
        val = 10;
        System.out.println(val);//  10
        System.out.println(val++);//    10
        System.out.println(val);//  11

        System.out.println("-------------------------------------------");

        //랜덤값
        Random r = new Random();
        int number1 = r.nextInt(100);
        System.out.println("랜덤숫자"+number1);
        if (number1 % 2 == 0) {
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
    }
}
