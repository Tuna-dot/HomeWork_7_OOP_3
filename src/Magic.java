import kg.geeks.HW_7_OOP_3.Heroes.Hero;

public class Magic extends Hero {

    public Magic(int health, int damage, String typeOfSuperpower) {
        super(health,damage, typeOfSuperpower);

    }

    public void applySuperAbility() {
        System.out.println("The Magician used his superpower: "
        + typeOfSuperpower);
    }
}
