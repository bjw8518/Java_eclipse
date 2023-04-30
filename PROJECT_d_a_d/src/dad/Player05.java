package dad;
import java.util.Scanner;

public class Player05 extends Base{

    private int strength;
    private int dexterity;

    public Player05() {
        this.name = "warrior2";
        this.hp = 100;
        this.power = 8;
        this.strength = dm.diceSix();
        this.dexterity = dm.diceSix();
        this.characterInfo = "[자신의 힘을 바탕으로 우직하게 맹공을 퍼붓는 전사 플레이어입니다.]";

    }

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
            if(this.pp > 0) {
                System.out.println();
                System.out.println("10면체 주사위를 굴립니다.");
                int diceTen = dm.diceTen();
                this.attackpower = diceTen;
                System.out.println(diceTen + " 이/가 나왔습니다.");
                this.pp--;
            }
            else {
                System.out.println("기술 사용 횟수가 다하였습니다.");
                this.attackMethod();
            }

        }
    }
    public void autoAttack01() {
        System.out.println();
        System.out.println(this.name + "이/가 동전을 던집니다.");
        System.out.println();
        int skillOrAttack = random.nextInt(2);
        if (skillOrAttack == 0) {
            System.out.println("앞면이 나왔습니다. 일반 공격을 사용합니다.");
        } else {
            System.out.println("뒷면이 나왔습니다. 기술을 시전합니다.");
        }
    }

    public void autoAttack02() {
        if (this.token) {
            System.out.println(this.name + " 이/가 " + "10면체 주사위를 굴립니다.");
            int comAttack = dm.diceTen();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }

            System.out.println(comAttack + " 이 나왔습니다.");
            this.attackpower = comAttack;
            System.out.println();
        } else {
            System.out.println(this.name + " 이/가 " + "10면체 주사위를 굴립니다.");
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            int comAttack = dm.diceTen();

            System.out.println(comAttack + "면이 나왔습니다.");
            this.attackpower = comAttack;
            System.out.println();
        }
    }

}