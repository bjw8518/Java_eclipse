package rsp;
import java.util.Scanner;

public class RSP2 {
    int usct = 0;
    int pcct = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<999999;i++) {
            System.out.println("가위 바위 보 게임입니다 \n원하는 숫자를 입력하세요 \n가위=0 바위=1 보=2 \n:");

            int you = sc.nextInt();
            int com = (int)(Math.random()*3);//


            if(you == com)
                System.out.println("비겼습니다.");
            else if(you == (com +1)%3)
                System.out.println("이겼습니다.");
            else
                System.out.println("졌습니다.");
        }

    }

}