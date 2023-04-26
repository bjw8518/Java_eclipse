package defaultt;

import java.util.Scanner;

public class SaveBox {
    int coin =0; //프로퍼티 쓸때는 this 필수
    String name = "돼지";

    public void deposit() { //메소드
        Scanner scanner = new Scanner(System.in); //스캐너
        System.out.println(this.name + "저금통에 입금할 금액을 입력해주세요.");
        String inputString = scanner.nextLine();//inputString이 스캐너로 받은 돈임
        int inputCoin = Integer.parseInt(inputString); //스트링 인티저 형변환
        System.out.println("딸그랑 " + inputCoin+"원 입금"); //스캐너로 받은 돈 얼마인지 출력
        this.coin = this.coin + inputCoin; //coin에는 inputCoin값만 남음

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
