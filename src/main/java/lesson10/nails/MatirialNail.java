package lesson10.nails;

public class MatirialNail extends Nail{
    @Override
    void putInHole(){
        System.out.println("MatirialNail:" + getMatirial());
    }
    String getMatirial(){
        return "add matirial";
    }
}
