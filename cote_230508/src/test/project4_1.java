package test;

import java.util.Scanner;

public class project4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for (int t = 0; t < k; t++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < m; j++) {
                rowSum += arr[x][j];
            }

            for (int i = 0; i < n; i++) {
                colSum += arr[i][y];
            }

            System.out.println(rowSum + " " + colSum);
        }

        scanner.close();
    }
}