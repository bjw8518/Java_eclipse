package test;

import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        System.out.println("문자열 입력");
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testcase; i++) {
            String input = sc.nextLine();
            int count = input.length() - input.replace("A","").length();
            System.out.println(count);

        }
    }
}