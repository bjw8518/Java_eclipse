package dad;

import java.util.Scanner;

public class MainPlay {

    public static void main(String[] args) {
        // 플레이어 클래스를 연결해주세요.
        Base[] base = new Base[5];
        Scanner scanner = new Scanner(System.in);

        base[0] = new Player01();
        base[1] = new Player02();
        base[2] = new Player03();
        base[3] = new Player04();
        base[4] = new Player05();

        // 캐릭터 선택. 선택한 캐릭터만 selected(boolean)을 true로 전환하여 구분합니다.
        System.out.println("PLAY GAME");
        System.out.println("캐릭터를 선택해주세요.");
        System.out.println("[1]: Player01");
        System.out.println("[2]: Player02");
        System.out.println("[3]: Player03");
        System.out.println("[4]: Player04");
        System.out.println("[5]: Player05");
        String userSelect = scanner.next();
        if (userSelect.equals("1")) {
            base[0].selected = true;
        } else if (userSelect.equals("2")) {
            base[1].selected = true;
        } else if (userSelect.equals("3")) {
            base[2].selected = true;
        } else if (userSelect.equals("4")) {
            base[3].selected = true;
        } else if (userSelect.equals("5")) {
            base[4].selected = true;
        }

        System.out.println("[게임을 시작합니다.]");
        for (int i = 0; i < 99999; i++) {
            System.out.println();
            System.out.println("[" + (i + 1) + " 라운드]");

//				userCount가 0이 아닌 최종 인원을 승자로 선정합니다.
//				isLive가 false가 될 때, userCount가 1에서 0이 되므로
//				모든 플레이어의 userCount 합산값이 1일 때, 오롯이 1을 지닌 캐릭터가 승자로 결정됩니다.
//				이 때 userCount 1값을 지닌 캐릭터의 이름을 출력하고, 게임을 종료합니다.
            if (base[0].userCount + base[1].userCount + base[2].userCount + base[3].userCount
                    + base[4].userCount == 1) {
                if (base[0].userCount == 1) {
                    System.out.println(base[0].name + "의 승리입니다!");
                    break;
                } else if (base[1].userCount == 1) {
                    System.out.println(base[1].name + "의 승리입니다!");
                    break;
                } else if (base[2].userCount == 1) {
                    System.out.println(base[2].name + "의 승리입니다!");
                    break;
                } else if (base[3].userCount == 1) {
                    System.out.println(base[3].name + "의 승리입니다!");
                    break;
                } else if (base[4].userCount == 1) {
                    System.out.println(base[4].name + "의 승리입니다!");
                    break;
                }
            } else {
//					게임 장기화 방지를 위해 데미지를 넣는 연산을 추가하고자 합니다.
//					10턴 이후부터 i-10씩 기본 데미지를 산입하겠습니다.
//					if(i > 9) {
//						System.out.println("10턴이 경과하였습니다.");
//						System.out.println("모든 플레이어는 앞으로 턴마다 1씩 누적 데미지를 입습니다.");
//					}
// 					현재 로직은 0번부터 4번까지 순차 진행이 이뤄집니다.
// 					선공권 로직, 집어넣겠습니다.

                // 플레이어블 시 doAction을, 적 캐릭터는 doAuto를 적용합니다.
                // doAction은 대상과 기술 선정을 플레이어로부터 입력받으며,
                // doAuto는 이를 자동화하여 진행합니다.
                if (base[0].selected) {
                    System.out.println(base[0].name + " 의 차례!");
                    base[0].doAction();
                    System.out.println("-----------------------");
                } else {
                    System.out.println(base[0].name + " 의 차례!");
                    base[0].doAuto();
                    System.out.println("-----------------------");
                }
                if (base[1].selected) {
                    System.out.println(base[1].name + " 의 차례!");
                    base[1].doAction();
                    System.out.println("-----------------------");
                } else {
                    System.out.println(base[1].name + " 의 차례!");
                    base[1].doAuto();
                    System.out.println("-----------------------");
                }
                if (base[2].selected) {
                    System.out.println(base[2].name + " 의 차례!");
                    base[2].doAction();
                    System.out.println("-----------------------");
                } else {
                    System.out.println(base[2].name + " 의 차례!");
                    base[2].doAuto();
                    System.out.println("-----------------------");
                }
                if (base[3].selected) {
                    System.out.println(base[3].name + " 의 차례!");
                    base[3].doAction();
                    System.out.println("-----------------------");
                } else {
                    System.out.println(base[3].name + " 의 차례!");
                    base[3].doAuto();
                    System.out.println("-----------------------");
                }
                if (base[4].selected) {
                    System.out.println(base[4].name + " 의 차례!");
                    base[4].doAction();
                    System.out.println("-----------------------");
                } else {
                    base[4].doAuto();
                    System.out.println(base[4].name + " 의 차례!");
                    base[4].doAuto();
                    System.out.println("-----------------------");
                }

            }

        }
    }
}