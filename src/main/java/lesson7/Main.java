package lesson7;

public class Main {
    public static void main(String[] args) {
//        String text = "я люблю їсти м'ясо";
//        System.out.println(text.replace("м'ясо", "землю"));
//
//        System.out.println(fuckOff("Cтрелков"));
        System.out.println(eatShit("я так люблю їсти пельмені, і зверху сметану",
                "пельмені"));
    }

    static String fuckOff(String name) {
        return name + " іді в жопу";
    }

    static String eatShit(String text, String food) {
        return text.replace(food, "гівно").toUpperCase();
    }
}
