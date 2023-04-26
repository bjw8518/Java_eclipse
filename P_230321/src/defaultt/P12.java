package defaultt;

import java.util.Scanner;

public class P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자입력");
        String input = scanner.nextLine();
        int nums = Integer.parseInt(input);


        boolean isPrime =true;
        for(int i = 0; i < nums;i++) { //for (int i = 0; i<10;i++) 0~9 10번 반복
            if(i < 2) {
                continue;//바로 아래문장실행//특정한 스택을 뛰어넘고 싶을때
            }
            if(nums % i == 0) {
                isPrime = false;
                break;//반복문을 빠져나가기위한
            }

        }

        if(isPrime) {
            System.out.println("소수");
        }else {
            System.out.println("");
        }

    }

}
//1.for문으로 내가 원하는 만큼 반복
//2.나눠진다는것의 의미
//3.continue;