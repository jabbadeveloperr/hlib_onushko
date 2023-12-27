package lessson12_1;

import lesson11.Main;

public class Gleb extends Father implements Radiation, NecroHunter {
    Hunter hunter = new Hunter();
    @Override
    public void getRadiationBackground() {
        System.out.println("єбать мене штирить");
    }

    @Override
    public void fairUsingLuk() {
        hunter.toString();
    }
}
