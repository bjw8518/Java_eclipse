package index;

import java.util.Random;

public class sorrt2 {
    public static void main(String[] args) {

        int[] arayraye = new int[30];	// 0~100 사이의 임의의 수 30개
        Random rendum = new Random();
        for (int i = 0; i < 30; i++) {
            arayraye[i] = rendum.nextInt(100); // 0~100 사이의 랜덤값
        }
        System.out.print("오름차순 정렬 전: ");//오름차순 정렬전
        for (int i = 0; i < arayraye.length; i++) {
            System.out.print(arayraye[i] +"|");
        }
        for (int i = 0; i < arayraye.length-1; i++) {//정렬
            for (int j = 0; j < arayraye.length-i-1; j++) {
                if (arayraye[j] > arayraye[j+1]) {
                    int temporary = arayraye[j];
                    arayraye[j] = arayraye[j+1];
                    arayraye[j+1] = temporary;
                }
            }
        }


        System.out.print("오름차순정렬후: ");// 배열 출력+정렬
        for (int i = 0; i < arayraye.length; i++) {
            System.out.print(arayraye[i] +"|");
        }
        System.out.println();
    }
}