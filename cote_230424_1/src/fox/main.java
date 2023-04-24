package fox;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int foxX = sc.nextInt();
        int foxY = sc.nextInt();
        int[][] field = new int[20][20];
        for (int i = 0; i < n; i++) {
            int rabbitX = sc.nextInt();
            int rabbitY = sc.nextInt();
            field[rabbitX-1][rabbitY-1] = 1;
    int count = 0;
    for (int i = foxX-2; i <= foxX; i++) {
    for (int j = foxY-2; j <= foxY; j++) {
    if (i < 0 || i >= 20 || j < 0 || j >= 20) {
    continue; } if (field[i][j] == 1) {
    count++;
    }
    }
    }
    for (int i = foxX-2, j = foxY-2; i <= foxX && j <= foxY; i++, j++) {
    if (i < 0 || i >= 20 || j < 0 || j >= 20) {
    continue;
    } if (field[i][j] == 1) {
    count++;
    }
    }
    for (int i = foxX-2, j = foxY; i <= foxX && j >= foxY-2; i++, j--) {
    if (i < 0 || i >= 20 || j < 0 || j >= 20) {
    continue;
    if (field[i][j] == 1) {
    count++;
    }
    } System.out.println(count);
    }
    }


    }

    }

