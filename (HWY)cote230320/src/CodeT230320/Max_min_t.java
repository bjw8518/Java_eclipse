package CodeT230320;


import java.util.Scanner;

public class Max_min_t {

	public static void main(String[] args) {
		System.out.println("숫자 5개를 입력받아 그 중에서 최소값 최대값 출력");
		
		int[] number;
		number = new int[5];
		Scanner in = new Scanner(System.in);
		int num;
		
		int min =Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		
		for(int i=0; i<number.length; i++){
			if(number[i]<min) min = number[i];
			if(number[i]<max) min = number[i];
			}
		
		}
}