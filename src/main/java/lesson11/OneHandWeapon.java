package lesson11;

public abstract class OneHandWeapon {

    void attack() {
        System.out.println("Ми наносимо удар використовуючи:" + typeOfAttack());
    }

    abstract String typeOfAttack();
}
