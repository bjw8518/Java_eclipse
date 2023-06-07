package dad;

import java.util.Random;
import java.util.Scanner;

public class Player03 extends Base {

    //   공격 이름
    String attackName[] = { "일반공격", "기술공격", "필살기" };

    boolean use = false; // 필살기 사용 유무


    Player03() {
        this.hp = 100;
        this.name = "Lux";
        this.power = 10;
        this.characterInfo = "[한 턴에 두 번의 주사위를 사용하는 행운을 타고 난 플레이어입니다.]";

    }

    Scanner scanner = new Scanner(System.in);
    DiceModule dm = new DiceModule();
    Random random = new Random();


    @Override
    public void attackMethod() {
        System.out.println();
        System.out.println("공격 기술을 선택해주세요.");
        System.out.println("0 : 일반공격");
        System.out.println("1 : 기술공격");
        System.out.println("2 : 필살기");


//      공격 서술
        this.attackInfo();

        String attackSkill = scanner.next();
        if (attackSkill.equals("0")) {
            System.out.println(attackName[0]);
            System.out.println("10면체 주사위를 굴립니다.");
            int diceTen = dm.diceTen();
            this.attackpower = diceTen;
            System.out.println(diceTen + " 이/가 나왔습니다.");

        } else if (attackSkill.equals("1")) {
            if(this.pp > 0) {
                System.out.println(attackName[1]);

                System.out.println();
                System.out.println("10면체 주사위를 굴립니다.");
                int diceTen = dm.diceTen();
                System.out.println("6면체 주사위를 굴립니다.");
                int diceSix = dm.diceSix();
                System.out.println(diceTen + "면이 나왔습니다.");
                System.out.println(diceSix + "면이 나왔습니다.");

                if(diceSix!=diceTen) {
                    System.out.println("두 주사위의 던진 값이 상이합니다 : 공격가능");
                    this.attackpower = diceTen+diceSix;
                    System.out.println(this.attackpower + " 이/가 나왔습니다.");
                }

                else  {
                    this.attackpower=0;
                    System.out.println("두 주사위의 던진 값이 같습니다. 패널티로 공격력이 일시로 0이 됩니다.");
                    System.out.println("아쉽게도 공격 불가능.");
                }
            } else if (attackSkill.equals("2")) {
                if (use) {
                    System.out.println(attackName[2]);
                    System.out.println("10면체 주사위를 굴립니다.");
                    int diceTen = dm.diceTen();
                    this.attackpower = (int) Math.round(diceTen * 3);
                }
                System.out.println("기술 사용 횟수가 다하였습니다.");
                this.attackMethod();

            }
            else {
                System.out.println("기술 사용 횟수가 다하였습니다.");
                this.attackMethod();
            }
            this.pp--;

        }
    }

    @Override
    public void autoAttack02() {
        if (this.token) {
            System.out.println(this.name + " 이/가 " + "10면체 주사위를 굴립니다.");
            int comAttack = dm.diceTen();
            int comAttack2 = dm.diceSix();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println(comAttack + " 이 나왔습니다.");
            this.attackpower = comAttack;
            System.out.println();
        } else {
            System.out.println(this.name + " 이/가 " + "10면체 주사위를 굴립니다.");
            System.out.println();
            System.out.println(this.name + "6면체 주사위를 굴립니다.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            int comAttack = dm.diceTen();
            int comAttack2 = dm.diceSix();

            System.out.println(comAttack + "면이 나왔습니다.");
            System.out.println(comAttack2 + "면이 나왔습니다.");

            if (comAttack != comAttack2) {
                this.attackpower = comAttack + comAttack2;
                System.out.println(this.attackpower + " 이/가 나왔습니다.");
                System.out.println("두 주사위의 던진 값이 상이합니다 : 공격가능");
            } else {
                this.attackpower = 0;
                System.out.println("두 주사위의 던진 값이 같습니다. 패널티로 공격력이 일시로 0이 됩니다.");
                System.out.println("아쉽게도 공격 불가능.");
            }
            this.pp--;
            System.out.println();
        }
    }

    public void attackInfo() {
        System.out.println(this.name + "의 공격 기술 설명");

        System.out.println("0번 " + this.attackName[0] + " : 그냥 때린다.");
        System.out.println("1번 " + this.attackName[1] + " : 운이 좋아야됨. 주사위 두개의 값의 합. (패널티 : 두 주사위 값의 합이 같으면 공력력 0.)");
        System.out.println("2번 " + this.attackName[2] + " : 필살기, 강력하다.");

    }

    @Override
    public void doAction() {

        this.attackMethod();

    }

}