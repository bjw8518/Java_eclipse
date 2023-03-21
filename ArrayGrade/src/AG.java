import java.util.Scanner;

public class AG {

	public static void main(String[] args) {
		
		int[] score = new int[10];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<10;i++) {
			System.out.println((i+1)+"번째 학생 성적입력");
			score[i] = scanner.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(score[i] < (score[i]+1)) {
				System.out.println(score[i]+"제일높은학생임다");
			}else {
				System.out.println("ㄴ");
			}
		}
	}
}