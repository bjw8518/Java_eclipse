package test;

import java.util.Arrays;
import java.util.Scanner;


public class project1 {
    public static void main(String[] args) {
        System.out.println("숫자입력");
        Scanner sc = new Scanner(System.in);

        int col = sc.nextInt();
        int row = sc.nextInt();
        int k = sc.nextInt();


        int[] arraw = new int[col];
        for (int i = 0; i < col; i++) {
            arraw[i] = sc.nextInt();
        }


        Arrays.sort(arraw);


        int first = arraw[col-1];
        int second = arraw[col-2];
        int count = (row / (k+1)) * k;
        count += row % (k+1);

        int result = 0;
        result += count * first;
        result += (row - count) * second;

        System.out.println(result);
    }
}