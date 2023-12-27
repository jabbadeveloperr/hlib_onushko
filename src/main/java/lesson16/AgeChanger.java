package lesson16;

public class AgeChanger {
    static int age;

    public AgeChanger(int i) {
        age = i;
    }


    public static void main(String[] args) {
        String text = "жопаfff";
        System.out.println(text.substring(1, text.length()));
    }

    public void addFourYears() {
        age = age + 4;
    }

    void removeFourYears() {
        age = age - 4;
    }

    void add100() {
        age = age + 100;
    }

    @Override
    public String toString() {
        return "AgeChanger{}:" + age;
    }
}
