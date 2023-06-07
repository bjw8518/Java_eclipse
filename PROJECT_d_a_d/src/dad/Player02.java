package dad;
import java.util.Random;
import java.util.Scanner;

public class Player02 extends Base {

    int power;
    int hp;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    DiceModule dm = new DiceModule();

    Player02() {
        this.name = "healer";
        this.hp = 100;
        this.power = 10;
        this.characterInfo = "[자가 치유와 함께 10면체*2의 피해를 입히는 필살기를 겸비한 힐러입니다.]";

    }


    @Override
    public void attackMethod() {
        System.out.println();
        System.out.println("공격 기술을 선택해주세요.");
        System.out.println("0 : 일반공격");
        System.out.println("1 : 기술공격");
        String attackSkill = scanner.next();
        if (attackSkill.equals("0")) {
            System.out.println("10면체 주사위를 굴립니다.");
            int diceTen = dm.diceTen();
            this.attackpower = diceTen;
            System.out.println(diceTen + " 이/가 나왔습니다.");


        } else if (attackSkill.equals("1")) {
            System.out.println("기술을 선택해주세요");
            System.out.println("1.SKILL01:공격력이 2배로 증가");
            System.out.println("2.SKILL02:HP 10 증가(기회는 5번)");

            String selectSkill = scanner.next();

            if (selectSkill.equals("1")) {
                System.out.println();
                System.out.println("10면체 주사위를 굴립니다.");
                int diceTen = dm.diceTen();
                this.attackpower = diceTen * 2;
                System.out.println(diceTen + " 이/가 나왔습니다.");

            } else if (selectSkill.equals("2")) {
                if (this.pp <= 0) {
                    System.out.println("이 기술은 이미 다 소진하였습니다.");
                    this.attackMethod();
                } else {
                    this.hp = this.hp + 10;
                    this.pp = this.pp - 1;
                    System.out.println("현재 hp: " + this.hp + "/ 현재 남은 스킬횟수: " + this.pp);
                }

            }

        }
    }

    @Override
    public void autoAttack02() {
        if (this.token) {
            System.out.println(this.name + " 이/가 " + "10면체 주사위를 굴립니다.");
            int comAttack = dm.diceTen();

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

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            int comAttack = dm.diceTen();

            System.out.println(comAttack + "면이 나왔습니다.");

            int attackauto = random.nextInt(2);
            if (attackauto == 0) {

                this.attackpower = comAttack * 3;
                System.out.println("SKILL01이 선택되었습니다. 공격력이 3배로 증가합니다.");
                System.out.println(attackpower + "로 공격합니다.");

            } else if (attackauto == 1) {
                if (this.pp == 0) {
                    System.out.println("이 기술은 이미 소진하였습니다.");
                } else {
                    this.hp = this.hp + 10;
                    this.pp = this.pp - 1;
                    System.out.println("현재 hp: " + this.hp + "/ 현재 남은 스킬횟수: " + this.pp);
                }

            }
        }
    }

}