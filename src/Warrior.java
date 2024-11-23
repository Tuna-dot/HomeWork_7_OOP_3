import kg.geeks.HW_7_OOP_3.Heroes.Hero;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String typeOfSuperpower) {
        super(health, damage, typeOfSuperpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("The Warrior used his super ability: "
        + typeOfSuperpower);

    }
}
