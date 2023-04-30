package dad;
import java.util.Random;
import java.util.Scanner;

public class Player01 extends Base {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    Player01() {
        this.name = "warrior";
        this.hp = 100;
        this.power = 6;
        this.pp = 1;
        this.characterInfo = "[10면체*3의 데미지를 입히는 강력한 필살기를 보유한 노련한 전사 플레이어입니다.]";

    }

    DiceModule dm = new DiceModule();


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
            // 일반공격 선택 시 10면체 주사위를 굴린 값을 공격 데미지로 저장합니다.

        } else if (attackSkill.equals("1")) {
            System.out.println("기술을 선택해주세요");
            System.out.println("1.SKILL01:공격력이 2배로 증가");
            System.out.println("2.SKILL02:공격력이 3배로 증가(단, 사용횟수는 1번)");

            String selectSkill = scanner.next();

            if (selectSkill.equals("1")) {
                System.out.println();
                System.out.println("10면체 주사위를 굴립니다.");
                int diceTen = dm.diceTen();
                this.attackpower = diceTen * 2;
                System.out.println(diceTen + " 이/가 나왔습니다.");
                this.pp--;

            } else if (selectSkill.equals("2")) {
                if (this.pp == 0) {
                    System.out.println("이 기술은 이미 소진하였습니다.");
                    this.attackMethod();
                } else {
                    System.out.println();
                    System.out.println("10면체 주사위를 굴립니다.");
                    int diceTen = dm.diceTen();
                    this.attackpower = diceTen * 3;
                    System.out.println(diceTen + " 이/가 나왔습니다.");
//               isUsed = true;
                    this.pp--;

                }

                // 방어스킬 사용 시, 입는 데미지를 기본 방어력 보다 +0.3하여서 hp차감
                // this.defence = this.defence + 0.3;
            }
            // +alpha
            // 기술공격 선택 시 적용 로직 별로 데미지를 산정해주세요.
            // 데미지 산정 간에는 10면체를 기준으로 설정해주세요.
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
            // @Override해서 각 클래스 친구들이 적으로 등장했을 때
            // 데미지를 결정할 기술과, 데미지 산식을 적용해주세요.

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
                    System.out.println();
                    System.out.println("10면체 주사위를 굴립니다.");
                    int diceTen = dm.diceTen();
                    this.attackpower = comAttack * 5;
                    System.out.println("SKILL02가 선택되었습니다. 공격력이 5배로 증가합니다.");
                    System.out.println(attackpower + "로 공격합니다.");
                    // isUsed = true;
                    this.pp--;

                }
                this.attackpower = comAttack;
                System.out.println();
            }
        }
    }
}