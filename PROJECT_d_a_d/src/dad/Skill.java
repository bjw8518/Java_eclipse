package dad;

// 기술 클래스
public class Skill {
    private String name;
    private int manaCost;
    private int damage;

    public Skill(String name, int manaCost, int damage) {
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    // 기술 사용 메서드
    public void useSkill(Skill skill) {
        if (this.mana >= skill.getManaCost()) {
            this.mana -= skill.getManaCost();
            int damage = (int) (Math.random() * skill.getDamage());
            System.out.println(this.name + "가 " + skill.getName() + "을 사용하여 " + damage + "의 데미지를 입혔습니다!");
        } else {
            System.out.println("마나가 부족합니다!");
        }
    }
}