package dad;
import java.util.Random;
import java.util.Scanner;

public class Base {

    protected String characterInfo;
    // 하부 진행 간 주사위를 던질 때마다 2초씩 딜레이하도록 기능 추가하겠습니다.
    int hp;
    int power;
    String name;
    int attackpower;
    int userCount = 1;
    int pp = 5;
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

    // 대상이 플레이어블로 지정되지 않은 경우, 공격 주사위를 굴리는 클래스
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
            // @Override해서 각 클래스 친구들이 적으로 등장했을 때
            // 데미지를 결정할 기술과, 데미지 산식을 적용해주세요.

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            int comAttack = dm.diceTen();

            System.out.println(comAttack + "면이 나왔습니다.");
            this.attackpower = comAttack;
            System.out.println();
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
    }

    public void doAuto() {
        this.autoAttack01();
        this.autoAttack02();
    }

    public void lifeMethod() {
        this.isLive();
        this.toString();
    }

    public String anouncerMent() {
        Random random = new Random();
        int randomTags = random.nextInt(5);
        if(randomTags == 0) {
            return this.name + "선수의 일격! 공격이 적중합니다!";
        }
        else if(randomTags == 1) {
            return "이야! 적중합니다! 괜히 피하려다가 더 아프게 맞은 것 같네요!";
        }
        else if(randomTags == 2) {
            return this.name + "선수의 시원한 한 방입니다! 관중석에서도 타격감이 느껴지네요!";
        }
        else if(randomTags == 3) {
            return "몸쪽으로 타격이 꽂힙니다! 좋은 타격이었네요!" + this.name + "선수!";
        }
        else {
            return "그럭저럭 나쁘지 않은 공격이었습니다.";
        }
    }


}
