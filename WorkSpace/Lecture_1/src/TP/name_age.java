package TP;
import java.util.Scanner;

public class name_age {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str;
        
        System.out.println("이름.");
        
        str = scan.nextLine();
        
        
        System.out.println("나이.");
        
        int agee = scan.nextInt();
        System.out.println("당신의 이름은" + str + "이고 나이는" + agee + "이군요");
        
		

	}

}
