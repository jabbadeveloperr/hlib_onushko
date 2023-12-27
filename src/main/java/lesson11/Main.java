package lesson11;

public class Main {
    public static void main(String[] args) {
//      OneHandWeapon broadSword = new BroadSword();
//      broadSword.attack();
//      OneHandWeapon knife = new Knife();
//      knife.attack();

        OneHandWeapon fabricKnife = OneHandWeaponFabric.getWeapon("knife");
        fabricKnife.attack();
    }
}