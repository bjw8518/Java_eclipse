package CodeT230320;


import java.util.Scanner;

public class Min_Max {
	public static void main(String[] args) {
		
		System.out.println("정수5개입력");
		Scanner input = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println();
		
		////////////////////
		// 정수를 입력받아 arr배열에 저장
		for (int i = 1; i <= 5; i++) {
			System.out.printf("정수를 입력해주세요 \n%d 번째 숫자: ", i);
			nums[i] = input.nextInt();
			System.out.println();
}
		/////////////////////

		
	}
	
}