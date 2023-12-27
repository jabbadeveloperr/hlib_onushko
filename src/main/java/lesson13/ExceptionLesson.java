package lesson13;

import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastName = "";
        int age = 0;

        try {
            System.out.println("Введіть прізвище:");
            lastName = scanner.nextLine();
            checkLastName(lastName);

            System.out.println("Введіть вік:");
            age = scanner.nextInt();
            checkAge(age);
        } catch (WrongNameException ex) {
            System.out.println("Помилка з іменем:" + ex.getMessage());
        }catch (WrongAgeException ex){
            System.out.println("Помилка з віком:" + ex.getMessage());
        }

    }

    private static void checkAge(int age) {
        if (age == 14) {
            System.out.println("через 4 роки в армію");
        } else {
            throw new WrongAgeException("В тебе не вік Глєба!");
        }
    }

    private static void checkLastName(String lastName) {
        if (lastName.equals("Онушко")) {
            System.out.println("Вітаю, Глеб!");
        } else {
            throw new WrongNameException("Ти не Онушко!!!");
        }
    }
}
