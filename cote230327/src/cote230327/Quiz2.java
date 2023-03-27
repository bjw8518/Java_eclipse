package cote230327;

import java.util.*;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); 
            Set<Integer> set = new TreeSet<>(); // 중복된 숫자를 제거하고 오름차순으로 출력하기 위해 TreeSet 사용

            for (int i = 0; i < N; i++) {
                set.add(sc.nextInt()); 
            }

            // set에 있는 숫자들을 출력
            for (int num : set) {
                System.out.print(num + " ");
            }
            System.out.println(); // 줄바꿈
        }

        sc.close();
    }
}