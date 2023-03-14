package p23;

import java.util.Scanner;

public class Random_input {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요");
		Scanner s = new Scanner(System.in);
		int ans = s.nextInt();
		if(ans % 2 == 1) {
			System.out.println("홀");
		}else {
			System.out.println("짝");
			}
		}
	}