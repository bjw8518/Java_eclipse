package defaultt;

import java.util.Scanner;

public class MainClass2 {
    public static void main(String[] args) {
        SaveBox2 s1 = new SaveBox2();
        SaveBox2 s2 = new SaveBox2();
        SaveBox2 s3 = new SaveBox2();
        SaveBox2 s4 = new SaveBox2();
        SaveBox2 s5 = new SaveBox2();


        s1.setName("첫번째");
        s2.setName("두번째");
        s3.setName("세번째");
        s4.setName("네번째");
        s5.setName("다섯번째");

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<9999;i++) {
            System.out.println("[1] 1번 저금통에 입금");
            System.out.println("[2] 1번 저금통에 입금");
            System.out.println("[3] 2번 저금통에 입금");
            System.out.println("[4] 2번 저금통에 출금");
            System.out.println("[5] 3번 저금통에 출금");
            System.out.println("[6] 3번 저금통에 출금");
            System.out.println("[7] 저금통 생성");
            System.out.println("[Q] Q누를 시 종료");
            System.out.println("test입니다");

            String inputMenu = scanner.nextLine();

            if(inputMenu.equals("q")) {
                break;
            }else if(inputMenu.equals("1")){
                s1.deposit();
            }else if(inputMenu.equals("2")){
                s1.withdraw();
            }else if(inputMenu.equals("3")){
                s2.deposit();
            }else if(inputMenu.equals("4")){
                s2.withdraw();
            }else if(inputMenu.equals("5")){
                s3.deposit();
            }else if(inputMenu.equals("6")){
                s3.withdraw();
            }else if(inputMenu.equals("7")) {
                s3.sabbing();
            }else {
                System.out.println("입력이 잘못됬습니다");

            }
        }
    }
}


