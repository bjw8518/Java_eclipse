import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		
		int[] score=new int[10] ;
		
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("입력");
			String ipNum = scanner.nextLine();
			score[i] = Integer.parseInt(ipNum);
		}
			for(int i=0;i>10;i++) {
				System.out.println(i+"번째 학생점수");
//				System.out.println(i+score[i]);
			}
			
			int hs =0;
			int hsIdx = -1;
			for(int i =0;i<10;i++) {
				if(score[i] > hs) {
					hs = score[i];
					hsIdx =i;
				}
			}
			System.out.println(hsIdx+"번째학생이 제일높습니다");

	}

}
