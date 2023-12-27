package lesson9;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertKgToPund(12, 2.2046));
        System.out.println(convertKgToPund(12));

        Main main2 = new Main();
    }

    static double convertKgToPund(double kg) {
        return convertKgToPund(kg, 2.2046);
    }

    static double convertKgToPund(double kg, double coeff) {
        return kg * coeff;
    }


}
