package defaultt;

import java.util.Scanner;

public class totalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 하나 입력");
        int nums = scanner.nextInt();
        for(int i = 0;i<nums;i++) {
            if(nums == nums/2) {
                System.out.println("소수가아님");
            }else if(nums == nums/1) {
                System.out.println("소수가아님");
            }else if(nums == nums/0) {
                System.out.println("소수입니까?");
            }else {
                System.out.println("소수");
            }

        }
        /*
         * nums = nums/2; //짝수 System.out.println(nums);
         */



    }

}
