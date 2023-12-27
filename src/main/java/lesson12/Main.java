package lesson12;

public class Main {
    public static void main(String[] args) {
//      OneHandWeapon broadSword = new BroadSword();
//      broadSword.attack();
//      OneHandWeapon knife = new Knife();
//      knife.attack();

        try {
            OneHandWeapon fabricKnife = OneHandWeaponFabric.getWeapon("knife1");
            fabricKnife.attack();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}