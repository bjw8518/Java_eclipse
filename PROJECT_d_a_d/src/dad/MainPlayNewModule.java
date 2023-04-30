package dad;
import java.util.Random;
import java.util.Scanner;

public class MainPlayNewModule {

    public static void main(String[] args) {
        // 플레이어 클래스를 연결해주세요.
        Base[] base = new Base[5];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        base[0] = new Player01();
        base[1] = new Player02();
        base[2] = new Player03();
        base[3] = new Player04();
        base[4] = new Player05();


        // 플레이어블로 선택한 캐릭터는 selected(boolean 타입) 변수를 true로 설정합니다.
        // 이후 대상 변수가 true인 캐릭터는 사용자부터 행동 및 대상 선택을 입력받아 수행하며,
        // non-playable의 경우, 해당 과정을 자동화하여 수행합니다.
        // non-playable 캐릭터의 공격 및 대상 선택은 무작위로 이뤄집니다.
        System.out.println("Dungeon Master Activated");
        System.out.println("캐릭터를 선택해주세요.");
        System.out.println("[0] " + base[0].name);
        System.out.println(base[0].characterInfo);
        System.out.println();
        System.out.println("[1] " + base[1].name);
        System.out.println(base[1].characterInfo);
        System.out.println();
        System.out.println("[2] " + base[2].name);
        System.out.println(base[2].characterInfo);
        System.out.println();
        System.out.println("[3] " + base[3].name);
        System.out.println(base[3].characterInfo);
        System.out.println();
        System.out.println("[4] " + base[4].name);
        System.out.println(base[4].characterInfo);
        int playerSelectNum = Integer.parseInt(scanner.next());
        for (int num = 0; num < base.length; num++) {
            if (playerSelectNum == num) {
                base[playerSelectNum].selected = true;
            } else {
                base[num].selected = false;
            }
        }

        // 입장 시퀀스. 플레이어 캐릭터의 입장 메세지가 출력됩니다.
        for (int login = 0; login < base.length; login++) {
            if (base[login].selected) {
                System.out.println(base[login].name + " 이/가 " + "투기장에 들어섭니다.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                System.out.println("매캐한 폭연과 쇠사슬이 끌리는 스산한 소리, 그리고 피비린내가 사방에서 느껴집니다.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                System.out.println(base[login].name + "은 무기를 쥔 자신의 손이 떨려오는 것을 느낍니다.");
                System.out.println();
                System.out.println("자 이제, 투기장의 문이 열립니다.");
            } else {
                continue;
            }
        }

        ////////////////////////////////////////////////////

        for (int i = 0; i < 3; i++) {

            // userCount가 1일 때, 홀로 userCount = 1인 플레이어가 최종 승자가 됩니다.
            if (base[0].userCount + base[1].userCount + base[2].userCount + base[3].userCount
                    + base[4].userCount == 1) {
                for (int live = 0; live < base.length; live++) {
                    if (base[live].userCount == 1) {
                        System.out.println();
                        System.out.println("마침내 투기장에 단 한 명의 승자만이 남았습니다!");
                        System.out.println(base[i].name + " 의 승리입니다!");
                        break;
                    }
                }
            }
            // sum(userCount) != 1인 경우, 플레이를 진행합니다.
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println((i + 1) + "Round");


            // 유저 플레이어의 진행 간
            int usersss = 0;
            for (int users = 0; users < base.length; users++) {
                if (base[users].selected) {
                    usersss = users;
                    System.out.println(base[users].name + " 의 차례입니다.");
                    System.out.println("현재 체력 : " + base[users].hp + "/100");
                    System.out.println();
                    for (int let = 0; let < base.length; let++) {
                        if (base[let].userCount == 1 && let != usersss) {
                            System.out.println("상대 : " + base[let].name + " / HP : " + base[let].hp + "/100");
                        }
                    }

                    base[users].doAction();
                    System.out.println("공격할 적을 선택해주세요.");
                    for (int enemy = 0; enemy < base.length; enemy++) {
                        if (enemy == users) {
                            continue;
                        } else {
                            System.out.println("[" + enemy + "]" + base[enemy].name);
                        }
                    }
                    String userSelEnemy = scanner.next();
                    for (int attack = 0; attack < base.length; attack++) {
                        if (Integer.parseInt(userSelEnemy) == attack) {
                            System.out.println(base[usersss] + " 이/가 " + base[attack].name + "에게 공격!");
                            System.out.println(base[usersss].anouncerMent());
                            System.out.println("---------------------------------------");
                            base[attack].hp = base[attack].hp - base[usersss].attackpower;
                            System.out.println(base[attack].name + "의 남은 체력 : " + base[attack].hp + "/100");
                            base[attack].isLive();
                            System.out.println();
                        } else {
                            continue;
                        }
                    }
                }
                // non-player 캐릭터의 진행 간
                else {
                    System.out.println(base[users].name + " 의 차례입니다.");
                    base[users].doAuto();
                    System.out.println(base[users].name + " 이/가 공격할 대상을 찾습니다.");
                    int enemySelec = random.nextInt(base.length);
                    if (enemySelec == users) {
                        enemySelec = enemySelec - 1;
                        if (users == 0) {
                            enemySelec = 2;
                        }
                    }
                    System.out.println(base[users].name + " 이/가 " + base[enemySelec] + "에게 공격!");
                    System.out.println(base[users].anouncerMent());
                    base[enemySelec].hp = base[enemySelec].hp - base[users].attackpower;
                    System.out.println(base[enemySelec].name + " 의 남은 체력 : " + base[enemySelec].hp + " /100");
                    base[enemySelec].lifeMethod();
                    System.out.println("---------------------------------------");
                    System.out.println();

                }

            }

        }

    }
}