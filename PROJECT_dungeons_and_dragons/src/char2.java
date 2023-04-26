//--기본 공격 10
//
//기본 방어 계수 0.8
//
//주사위굴림(20면체)를 바탕으로 선공권 싸움.
//
//기본 명중 80% 기준
//10턴 베이스
public class char2 extends Base{
    double defence = 0.6;
    String name = "Archer";
    int hp=65;
    int damage=15;

    public int att(int att){
        if (att==1){
            this.damage=this.damage;
        }else if (att==2){
            this.damage=this.damage*2;
        }

        return damage;
    }
}

