public class Base {
    int hp;
    int power;
    String name;

    Base(){
        this.hp = 100;
        this.name = "기본";
    }

    public void underAttack() {
        this.hp = this.hp - 10;
    }

    public void underAttack(int attack){
        this.hp =this.hp - attack;
    }


    public boolean isLive(){
        if(this.hp<1){
            return false;
        }
        return true;
    }

    public String toString(){
        if (this.isLive()){
            return this.name + "("+ this.hp+")";
        }
        return this.name + "is dead";
    }

}
