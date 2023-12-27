package lessson24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть імя користувача:");
        User user = new User();
        if (scanner.hasNextLine()){
           user.setName(scanner.nextLine());
        }
        System.out.println("Введіть вік користувача:");

        if (scanner.hasNextInt()){
            user.setAge(scanner.nextInt());
        }




    }
}
