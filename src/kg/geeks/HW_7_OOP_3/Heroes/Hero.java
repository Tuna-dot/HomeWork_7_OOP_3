package kg.geeks.HW_7_OOP_3.Heroes;

public abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected int damage;
    protected String typeOfSuperpower;


    public Hero(int health, int damage, String typeOfSuperpower) {
        this.health = health;
        this.damage = damage;
        this.typeOfSuperpower = typeOfSuperpower;
    }

}
