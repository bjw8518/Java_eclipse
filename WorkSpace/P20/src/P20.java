import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		System.out.println("국어점수를 입력해주세요");
		
		Scanner s = new Scanner (System.in);
		int number = s.nextInt();
		
		if(number >= 90) {
			System.out.println("A");
		}else if(number >= 80){ // number < 90 && number >= 80
			System.out.println("B");
		}else if(number >= 70) { //number < 90 && number >= 70
			System.out.println("C");
		}else if(number >= 60) {//number < 90 && number >= 60
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
