package lesson12;

public class OneHandWeaponFabric {
    static OneHandWeapon getWeapon(String name) {
        if (name.equals("knife")) {
            return new Knife();
        } else if (name.equals("broadsword")) {
            return new BroadSword();
        } else if (name.equals("wooden stick")) {
            return new WoodenStick();
        } else {
            throw new RuntimeException(name + " is not exist!");
        }
    }
}
