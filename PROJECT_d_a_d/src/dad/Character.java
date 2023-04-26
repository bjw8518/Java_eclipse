package dad;

public class Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int dexterity;
    private int intelligence;

    public Character(String name, int health, int mana, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int attack() {
        return (int)(Math.random() * strength);
    }

    public void useSkill(int manaCost) {
        this.mana -= manaCost;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void heal(int amount) {
        this.health += amount;
    }
}
