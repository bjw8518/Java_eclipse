package p23;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("점수를 입력해주세요");
		Scanner gd = new Scanner(System.in);
		
		int grade = gd.nextInt();
		
		if(grade >= 90) {  //90보다 크거나 같을때
			System.out.println("A");
		}else if(grade >= 80){ //80보다 크거나 같을때
			System.out.println("B");
		}else if(grade >= 70){ //70보다 크거나 같을때
			System.out.println("C");
		}else if(grade >= 60){ //60보다 크거나 같을때
			System.out.println("D");
		}else{ //60보다 크거나 같을때
			System.out.println("f");
		}

	}

}

//국어점수 입력을 받아서
//90 이상이면 A
//80 이상이면 B
//70 이상이면 C
//60 이상이면 D
//그 아래면 F를 출력하세요
