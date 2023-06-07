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
        System.out.println("[0]: Player01");
        System.out.println("[1]: Player02");
        System.out.println("[2]: Player03");
        System.out.println("[3]: Player04");
        System.out.println("[4]: Player05");
        String userSelect = scanner.next();
        for(int selNum = 1; selNum < 6; selNum++) {
            if(userSelect.equals(selNum)){
                base[selNum].selected = true;
            }
            else {
                continue;
            }
        }

        System.out.println("[게임을 시작합니다.]");
        for (int i = 0; i < 99999; i++) {
            System.out.println();
            System.out.println("[" + (i + 1) + " 라운드]");


//				모든 플레이어의 userCount 합산값이 1일 때, 오롯이 1을 지닌 캐릭터가 승자로 결정됩니다.
//				이 때 userCount 1값을 지닌 캐릭터의 이름을 출력하고, 게임을 종료합니다.
            if (base[0].userCount + base[1].userCount + base[2].userCount + base[3].userCount
                    + base[4].userCount == 1) {
                for (int live = 0; live < base.length; live++) {
                    if (base[live].userCount == 1) {
                        System.out.println(base[i].name + " 의 승리입니다!");
                        System.out.println("빰 빠바밤!");
                        break;
                    }
                }

            } else {
                // 10 턴 이후부터 생존해있는 모든 플레이어에게 턴마다 1씩 누적 데미지를 입힙니다.
                // 이를 통해 게임의 장기화를 방지합니다.
                if (i > 9) {
                    System.out.println("10턴이 경과하였습니다.");
                    System.out.println("살아있는 플레이어는 매턴 1씩 증가하는 데미지를 입습니다.");
                    for (int n = 0; n < 100; n++) {
                        if (base[0].isLive) {
                            System.out.println(base[0].name + " 에게 탈진 데미지" + (i - 1) + "!");
                            base[0].hp = base[0].hp - (i - 9);
                            base[0].lifeMethod();
                        }
                        if (base[1].isLive) {
                            System.out.println(base[1].name + " 에게 탈진 데미지" + (i - 1) + "!");
                            base[1].hp = base[1].hp - (i - 9);
                            base[1].lifeMethod();
                        }
                        if (base[2].isLive) {
                            System.out.println(base[2].name + " 에게 탈진 데미지" + (i - 1) + "!");
                            base[2].hp = base[2].hp - (i - 9);
                            base[2].lifeMethod();
                        }
                        if (base[3].isLive) {
                            System.out.println(base[3].name + " 에게 탈진 데미지" + (i - 1) + "!");
                            base[3].hp = base[3].hp - (i - 9);
                            base[3].lifeMethod();
                        }
                        if (base[4].isLive) {
                            System.out.println(base[4].name + " 에게 탈진 데미지" + (i - 1) + "!");
                            base[4].hp = base[0].hp - (i - 9);
                            base[4].lifeMethod();
                        }
                    }
                    continue;
                }


                // 플레이어블 시 doAction을, 적 캐릭터는 doAuto를 적용합니다.
                // doAction은 대상과 기술 선정을 플레이어로부터 입력받으며,
                // doAuto는 이를 자동화하여 진행합니다.

                if (base[0].selected) {
                    System.out.println(base[0].name + " 의 차례!");
                    base[0].doAction();
                    System.out.println("공격 대상을 정해주세요.");
                    System.out.println("[2] " + base[1].name);
                    System.out.println("[3] " + base[2].name);
                    System.out.println("[4] " + base[3].name);
                    System.out.println("[5] " + base[4].name);
                    String userSelNum = scanner.next();
                    if (userSelNum.equals("2")) {
                        base[1].hp = base[1].hp - base[0].attackpower;
                        System.out.println(
                                base[0].name + " 이/가 " + base[1].name + " 에게 공격! " + base[0].attackpower + "데미지!");
                        System.out.println(base[1].name + " 남은 HP : " + base[1].hp + "/100");
                        base[1].lifeMethod();
                    } else if (userSelNum.equals("3")) {
                        base[2].hp = base[2].hp - base[0].attackpower;
                        System.out.println(
                                base[0].name + " 이/가 " + base[2].name + " 에게 공격! " + base[2].attackpower + "데미지!");
                        System.out.println(base[2].name + " 남은 HP : " + base[2].hp + "/100");
                        base[2].lifeMethod();
                    } else if (userSelNum.equals("4")) {
                        base[3].hp = base[3].hp - base[0].attackpower;
                        System.out.println(
                                base[0].name + " 이/가 " + base[3].name + " 에게 공격! " + base[2].attackpower + "데미지!");
                        System.out.println(base[3].name + " 남은 HP : " + base[3].hp + "/100");
                        base[3].lifeMethod();
                    } else if (userSelNum.equals("5")) {
                        base[4].hp = base[4].hp - base[4].attackpower;
                        System.out.println(
                                base[0].name + " 이/가 " + base[4].name + " 에게 공격! " + base[2].attackpower + "데미지!");
                        System.out.println(base[4].name + " 남은 HP : " + base[4].hp + "/100");
                        base[4].lifeMethod();
                    }

                    System.out.println("-----------------------");
                } else {
                    System.out.println(base[0].name + " 의 차례!");
                    base[0].doAuto();
                    System.out.println("-----------------------");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
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
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
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
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
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
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
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
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

            }

        }
    }
}