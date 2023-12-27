package lesson17;

public class Main {
    public static void main(String[] args) {
        // 10 5 2.5 1.25 1.125555
        double lastNumber = 1;

        while (lastNumber <= 15) {
            System.out.print(lastNumber + " ");
            lastNumber = lastNumber + 1.5;
        }
    }
}
