package lesson11;

public class OneHandWeaponFabric {
    static OneHandWeapon getWeapon(String name) {
        return switch (name) {
            case "knife" -> new Knife();
            case "broadsword" -> new BroadSword();
            case "wooden stick" -> new WoodenStick();
            default -> throw new RuntimeException(name + " is not exist!");
        };
    }
}
