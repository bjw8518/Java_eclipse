package test;
import java.util.*;

public class project3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int[] arr = new int[input.length];

            for (int j = 0; j < input.length; j++) {
                arr[j] = Integer.parseInt(input[j]);
            }

            Arrays.sort(arr);

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}