package test;

import java.util.Arrays;
import java.util.Scanner;
import static java.util.Arrays.*;

public class project3 {
    public static void main(String[] args) {
        System.out.println("숫자입력");
        Scanner sc = new Scanner(System.in);
        int[] testCases;
        testCases = new int[]{sc.nextInt()};

        Arrays.sort(testCases);
        System.out.println(Arrays.toString(testCases));
//        for(int x : testCases)
//            System.out.print(x + ", ");
    }
}