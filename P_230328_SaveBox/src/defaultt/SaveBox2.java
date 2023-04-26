package defaultt;

import java.util.Scanner;

public class SaveBox2 {
    int coin =0; //프로퍼티 쓸때는 this 필수
    int coins=0;
    String name = "돼지";
    boolean isBroken = false;

    public void sabbing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.name + "새로운 저금통에 넣을금액");
        String inputString = scanner.nextLine();
        int nwinputCoin = Integer.parseInt(inputString);
        this.coins = this.coins + nwinputCoin;
        System.out.println("지금돈"+this.coins+"입니다");

    }

    public void deposit() { //메소드
        if(this.isBroken) {
            System.out.println("이저금통은 사용할수없습니다");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.name + "에 입금할 금액을 입력해주세요.");
        String inputString = scanner.nextLine();
        int inputCoin = Integer.parseInt(inputString);


        this.coin = this.coin + inputCoin;
        System.out.println("땡그랑");
        System.out.println("현재보유금액은"+this.coin+"입니다");
    }

    public void withdraw() {
        System.out.println(this.name+"저금통을 깼습니다.");
        System.out.println("최종 출금 금액은 " + coin + "입니다.");
    }

    public void setName(String name) {
        this.name=name;
        //같은이름이지만 다른변수입니다
    }
}
