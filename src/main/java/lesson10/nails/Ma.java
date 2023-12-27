package lesson10.nails;

public class Ma {
    public static void main(String[] args) {
        Nail nail = new Nail();
        nail.putInHole();

        MatirialNail matirialNail = new MatirialNail();
        matirialNail.putInHole();

        Nail nail2 = new EmergencySuperProNail();


        String nailName = "";

        if (nailName.equals("матеріальний цвях")){
            nail2 = new MatirialNail();
        } else if (nailName.equals("енергетичний цвях")) {
            nail2 = new EmergencySuperProNail();
        }

        nail2.putInHole();
    }
}
