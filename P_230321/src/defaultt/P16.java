package defaultt;

import java.util.Arrays;
import java.util.Scanner;

public class P16 {

    public static void main(String[] args) {

        int[] score = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<10;i++) {
            System.out.println((i+1)+"번째 학생의 성적입력");
            score[i] = scanner.nextInt();
        }
        int totalScore = 0;

        for(int i=0;i<10;i++) {
            totalScore = totalScore + score[i];
        }
        System.out.println(Arrays.toString(score));
        System.out.println("최종점수는"+totalScore);
    }
}
