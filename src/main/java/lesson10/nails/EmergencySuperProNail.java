package lesson10.nails;

public class EmergencySuperProNail extends Nail{

    @Override
    void putInHole(){
        System.out.println("EmergencySuperProNail:" + getEnergy());
    }

   String getEnergy(){
        return "ENERGY!!!!";
    }
}
