package lessson19;

public class MagicWeapon extends Weapon{
    @Override
    void attack() {
        System.out.println("magic attack");
    }

    @Override
    void killYourSelf() {
        throw new UnsupportedOperationException();
    }
}
