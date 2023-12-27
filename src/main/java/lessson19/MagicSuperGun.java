package lessson19;

public class MagicSuperGun extends MagicGun{
    @Override
    void attack() {
        System.out.println("make love not war");
    }

    public static void main(String[] args) {
      Weapon weapon = new MagicGun();
      weapon.attack();
    }
}
