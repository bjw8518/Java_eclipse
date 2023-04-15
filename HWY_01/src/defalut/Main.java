package defalut;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Nu = scanner.nextInt();

        int[] arr = new int[Nu];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr);//오름차순 정렬
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
