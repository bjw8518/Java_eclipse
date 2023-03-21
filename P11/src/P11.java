import java.util.Random;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		for(int i =0;i<9999999;i++) {
		Scanner scanner = new Scanner(System.in); //Scanner scanner = new Scanner(System.in);요새 이렇게씀
		Random random = new Random();
		System.out.println("가위[0] 바위[1] 보[2] 중 하나 입력. 종료[q]");
		String inputString = scanner.nextLine();
		if(inputString.equals("q")) {
			System.out.println("게임종료");
			break;
		}
		
		
		int userInput = Integer.parseInt(inputString);
		int comInput = random.nextInt(3);
		
		if (comInput == 0) {
			System.out.println("컴퓨터는 가위");
		}else if(comInput == 1) {
			System.out.println("컴퓨터는 바위");
		}else if(comInput == 2) {
			System.out.println("컴퓨터는 보");
		}
		if(userInput == comInput) {
			System.out.println("비겼습니다");
		}else if((userInput == 0 && comInput == 1) || (userInput == 1 && comInput == 2)  || (userInput == 2 && comInput == 0) ) {
			System.out.println("컴퓨터가 이김");
		}else{
			System.out.println("사용자가 이김");
		}
		}
	}
	}
