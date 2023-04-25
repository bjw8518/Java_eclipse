import java.util.Random;

//--기본 공격 10
//
//기본 방어 계수 0.8
//
//주사위굴림(20면체)를 바탕으로 선공권 싸움.
//
//기본 명중 80% 기준
//10턴 베이스
public class char3 extends Base{
    char3() {
        this.name = "Archer";
    }

    public void underAttack(){
        Random rd = new Random();
        int attack = rd.nextInt(20);
        System.out.println(this.name+"은"+attack+"의 피해를 입음");
        this.hp = this.hp - attack;
    }
}

