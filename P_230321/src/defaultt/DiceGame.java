package defaultt;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("화면에 주사위를 굴릴까요?");
        String userInput = scanner.nextLine();
        int userDice = Integer.parseInt(userInput);



        for(int i =0;i<9999999;i++) {
            if(userDice == 0) {
                System.out.println("1을 출력");
            }else if(userDice == 1) {
                System.out.println("2를 출력");
            }else {
                System.out.println("3");
            }
        }
    }


}
