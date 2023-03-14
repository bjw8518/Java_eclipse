package TP;
import java.util.Scanner;

public class UserSum {

	public static void main(String[] args) {
		System.out.println("첫번째 숫자를 입력해 주세요");
		Scanner F =  new Scanner(System.in);
		int first = F.nextInt();
		
		System.out.println("두번째 숫자를 입력해 주세요");
		int second = F.nextInt();
		
		int sum = first + second;
		
		System.out.println("입력받은 값 의 합은" + sum + "입니다");
		
		
	}

}
