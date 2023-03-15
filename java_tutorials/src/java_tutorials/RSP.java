package java_tutorials;

import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		
        System.out.println("가위 바위 보 게임입니다 \n원하는 숫자를 입력하세요 \n가위=0 바위=1 보=2 \n:");
        Scanner sc = new Scanner(System.in);
        int you = sc.nextInt();
        int com = (int)(Math.random()*3);//
        
        if(you == com)
            System.out.println("비겼습니다.");        
        else if(you == (com +1)%3)
        	System.out.println("이겼습니다. 당신이 낸건"+ you+"이고 컴퓨터가 낸건" +com+"입니다");
        else
        	System.out.println("졌습니다. 당신이 낸건"+ you+"이고 컴퓨터가 낸건" +com+"입니다");
	}
}