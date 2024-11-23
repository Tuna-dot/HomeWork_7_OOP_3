import kg.geeks.HW_7_OOP_3.Heroes.Hero;

public class Medic extends Hero {
    int healthPoints;


    public Medic(int health, int damage, int healthPoints, String typeOfSuperpower) {
        super(health, damage, typeOfSuperpower);
        this.healthPoints = healthPoints;
        increaseExperience();
    }


    public void increaseExperience() {
        this.healthPoints = (int) Math.abs(healthPoints * 0.1);

    }


    @Override
    public void applySuperAbility() {
        System.out.println("The Medic used his superpower to restore his health: "
        + typeOfSuperpower);

    }
}
