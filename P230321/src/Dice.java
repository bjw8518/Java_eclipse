import java.util.*;

public class Dice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		for(int i =0;i<9999999;i++) {
		System.out.println("화면에 주사위를 굴릴까요?");
		scanner.nextLine();
		
		int userDice = random.nextInt(6) + 1;
		System.out.println("유저가굴림"+userDice);
		
		System.out.println("컴퓨터가 굴릴까요?");
		scanner.nextLine();
		int comDice = random.nextInt(6) + 1;
		System.out.println("컴주사위"+comDice);
		
		if(userDice == comDice) {
			System.out.println("비김");
		}else if(userDice < comDice) {
			System.out.println("컴승");
		}else {
			System.out.println("유저승");
		}
	}
	}

}
