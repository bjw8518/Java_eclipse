import java.util.Random;

//--기본 공격 10
//
//기본 방어 계수 0.8
//
//주사위굴림(20면체)를 바탕으로 선공권 싸움.
//
//기본 명중 80% 기준
//10턴 베이스
public class char1 extends Base{
    double defence = 0.8;
    String name = "Archer";
    int lastDamage = 0;
    int damage = 15;
    //   int[] attAndSuccessRate = new int[2];
    boolean use = false;

    //   10턴 베이스
    Random random = new Random();

    //  underAttack
    public void underAttack(int attack) {
        this.hp = this.hp - (int) Math.round(attack * this.defence);
    }


    //   attack
    public int baseAttack() {
        return damage;
    }

    //   공격 - 응용 1
    public int piecefullAttack() {
        if (this.hp > 90) {
            damage = 15;
        } else if (this.hp > 80) {
            damage = (int) Math.round(damage * 1.5);
        } else if (this.hp > 70) {
            damage = (int) Math.round(damage * 2.0);
        } else if (this.hp > 60) {
            damage = (int) Math.round(damage * 2.5);
        } else if (this.hp > 50) {
            damage = (int) Math.round(damage * 3.0);
        } else {
            damage = (int) Math.round(damage * 3.5);
        }
        return damage;
    }

    //   공격 - 응용 2
    public int sparkleAttack() {
        if (!use) {
//         int successRate = random.nextInt(101);
            damage = (int) Math.round(damage * 5);
        } else {
// 생각해보기
        }
        return damage;
    }

}