package test;
import java.util.Arrays;

public class project5_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 6};
        int[] arr2 = {6, 1, 2, 1, 4, 3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean same = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                same = false;
                break;
            }
        }

        if (same) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }
    }
}
