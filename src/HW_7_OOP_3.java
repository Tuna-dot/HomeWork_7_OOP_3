import kg.geeks.HW_7_OOP_3.Heroes.Hero;

public class HW_7_OOP_3 {
    public static void main(String[] args) {

      Hero[] heroes = new Hero[2];
        heroes = new Hero[]{new Magic(300, 25, "FIREBAL"),
                new Warrior(350, 30, "ENHANCED BLOW"),
                new Medic(300, 0,100,  "HEALTH POINTS")};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic medic) {
                medic.increaseExperience();
            }

        }


    }
}
