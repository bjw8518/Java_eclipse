package dad;

import java.util.Random;
import java.util.Scanner;

public class Base {

    // 하부 진행 간 주사위를 던질 때마다 2초씩 딜레이하도록 기능 추가하겠습니다.
    int hp;
    int power;
    String name;
    int attackpower;
    int userCount = 1;
    boolean isLive = true;
    boolean selected = false;
    boolean token;

    Base() {
        this.hp = 100;
        this.name = "Default_Name";
        this.power = 10;
    }

    Scanner scanner = new Scanner(System.in);
    DiceModule dm = new DiceModule();
    Random random = new Random();

    // 기술 선택창. 각 클래스에서 @Override 받아 특성별로 입력해주세요.
    // 해당 Method를 통해 공격 데미지를 설정합니다.
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
            System.out.println();
            System.out.println("10면체 주사위를 굴립니다.");
            int diceTen = dm.diceTen();
            this.attackpower = diceTen;
            System.out.println(diceTen + " 이/가 나왔습니다.");
            // +alpha
            // 기술공격 선택 시 적용 로직 별로 데미지를 산정해주세요.
            // 데미지 산정 간에는 10면체를 기준으로 설정해주세요.
        }
    }

    // 대상이 플레이어블로 지정되지 않은 경우, 공격 주사위를 굴리는 클래스
    public void autoAttack01() {
        System.out.println();
        System.out.println("컴퓨터가 동전을 던집니다.");
        int skillOrAttack = random.nextInt(2);
        if (skillOrAttack == 0) {
            System.out.println("앞면이 나왔습니다. 일반 공격을 사용합니다.");
            System.out.println();
        } else {
            System.out.println("뒷면이 나왔습니다. 기술을 시전합니다.");
            System.out.println();
        }
    }

    public void autoAttack02() {
        if (this.token) {
            System.out.println("컴퓨터가 10면체 주사위를 굴립니다.");
            int comAttack = dm.diceTen();
            System.out.println(comAttack + " 이 나왔습니다.");
            this.attackpower = comAttack;
            System.out.println();
        } else {
            System.out.println("컴퓨터가 10면체 주사위를 굴립니다.");
            int comAttack = dm.diceTen();
            // @Override해서 각 클래스 친구들이 적으로 등장했을 때
            // 데미지를 결정할 기술과, 데미지 산식을 적용해주세요.
            System.out.println(comAttack + "면이 나왔습니다.");
            this.attackpower = comAttack;
            System.out.println();
        }
    }

    // 컴퓨터가 무작위로 대상을 선택합니다.
    // 지금 로직대로면, 자해를 막을 수 없습니다.
    // 탈락한 캐릭터에 대한 공격이 발생할 경우를 막을 추가 제어 또한 필요합니다.
    public void autoAttack03() {
        Player01 p1 = new Player01();
        Player02 p2 = new Player02();
        Player03 p3 = new Player03();
        Player04 p4 = new Player04();
        Player05 p5 = new Player05();
        System.out.println();
        System.out.println(this.name + "이/가 공격 대상을 정합니다.");
        int comSels = random.nextInt(4);
        if (comSels == 0) {
            System.out.println(p1.name + "을 공격합니다.");
            System.out.println(p1.name + " 에게 " + this.attackpower + "데미지!");
            p1.hp = p1.hp - this.attackpower;
            System.out.println();
            System.out.println(p1.name + " " + p1.hp + "/" + "100");
            p1.isLive();
            p1.toString();
        } else if (comSels == 1) {
            System.out.println(p2.name + "을 공격합니다.");
            System.out.println(p2.name + " 에게 " + this.attackpower + "데미지!");
            p2.hp = p2.hp - this.attackpower;
            System.out.println(p2.name + " " + p2.hp + "/" + "100");
            System.out.println();
            p2.isLive();
            p2.toString();
        } else if (comSels == 2) {
            System.out.println(p3.name + "을 공격합니다.");
            System.out.println(p3.name + " 에게 " + this.attackpower + "데미지!");
            p3.hp = p3.hp - this.attackpower;
            System.out.println(p3.name + " " + p3.hp + "/" + "100");
            System.out.println();
            p3.isLive();
            p3.toString();
        } else if (comSels == 3) {
            System.out.println(p4.name + "을 공격합니다.");
            System.out.println(p4.name + " 에게 " + this.attackpower + "데미지!");
            p4.hp = p4.hp - this.attackpower;
            System.out.println(p4.name + " " + p4.hp + "/" + "100");
            System.out.println();
            p4.isLive();
            p4.toString();
        } else if (comSels == 4) {
            System.out.println(p5.name + "을 공격합니다.");
            System.out.println(p5.name + " 에게 " + this.attackpower + "데미지!");
            p5.hp = p5.hp - this.attackpower;
            System.out.println(p5.name + " " + p5.hp + "/" + "100");
            System.out.println();
            p5.isLive();
            p5.toString();
        }

    }

    // 플레이어 1, 2, 3, 4, 5를 대상으로 공격 대상을 선정합니다.
    public void attack() {
        Player01 p1 = new Player01();
        Player02 p2 = new Player02();
        Player03 p3 = new Player03();
        Player04 p4 = new Player04();
        Player05 p5 = new Player05();
        System.out.println();
        System.out.println("공격할 대상을 선택해주세요.");
        System.out.println("1 : " + p1.name);
        System.out.println("2 : " + p2.name);
        System.out.println("3 : " + p3.name);
        System.out.println("4 : " + p4.name);
        System.out.println("5 : " + p5.name);
        String userSels = scanner.next();
        if (userSels.equals("1")) {
            System.out.println(p1.name + "을 선택하셨습니다.");
            System.out.println(p1.name + " 에게 " + this.attackpower + "데미지!");
            p1.hp = p1.hp - this.attackpower;
            System.out.println(p1.name + " " + p1.hp + "/" + "100");
            System.out.println();
            p1.isLive();
            p1.toString();
        } else if (userSels.equals("2")) {
            System.out.println(p2.name + "을 선택하셨습니다.");
            System.out.println(p2.name + " 에게 " + this.attackpower + "데미지!");
            p2.hp = p2.hp - this.attackpower;
            System.out.println(p2.name + " " + p2.hp + "/" + "100");
            System.out.println();
            p2.isLive();
            p2.toString();
        } else if (userSels.equals("3")) {
            System.out.println(p3.name + "을 선택하셨습니다.");
            System.out.println(p3.name + " 에게 " + this.attackpower + "데미지!");
            p3.hp = p3.hp - this.attackpower;
            System.out.println(p3.name + " " + p3.hp + "/" + "100");
            System.out.println();
            p3.isLive();
            p3.toString();
        } else if (userSels.equals("4")) {
            System.out.println(p4.name + "을 선택하셨습니다.");
            System.out.println(p4.name + " 에게 " + this.attackpower + "데미지!");
            p4.hp = p4.hp - this.attackpower;
            System.out.println(p4.name + " " + p4.hp + "/" + "100");
            System.out.println();
            p4.isLive();
            p4.toString();
        } else if (userSels.equals("5")) {
            System.out.println(p5.name + "을 선택하셨습니다.");
            System.out.println(p5.name + " 에게 " + this.attackpower + "데미지!");
            p5.hp = p5.hp - this.attackpower;
            System.out.println(p5.name + " " + p5.hp + "/" + "100");
            System.out.println();
            p5.isLive();
            p5.toString();
        } else {
            System.out.println("올바른 대상을 선택해주세요.");
            this.attack();
        }
    }

    // hp를 1과 비교. 1 미만이라면 isLive를 false로 return
    // 1 이상이라면 isLive를 true로 return
    public boolean isLive() {
        if (this.hp < 1) {
            return false;
        } else {
            return true;
        }
    }

    // isLive boolean을 기준으로 캐릭터의 생사를 판별합니다.
    // true 이면 숨이 붙어있고, false이면 죽은 것입니다.
    public String toString() {
        if (this.isLive()) {
            return this.name + " " + "(" + this.hp + ")";
        } else
            this.userCount--;
        return this.name + " 는 눈 앞이 깜깜해졌습니다!";
    }

    public void doAction() {
        this.attackMethod();
        this.attack();
    }

    public void doAuto() {
        this.autoAttack01();
        this.autoAttack02();
        this.autoAttack03();
    }
}
