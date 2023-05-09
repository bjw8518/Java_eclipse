package test;

import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        System.out.println("입력");
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt(); //세로(행)
        int row = sc.nextInt(); //가로(열)
        int[][] arr = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();


    }
}
//coln
//rowm