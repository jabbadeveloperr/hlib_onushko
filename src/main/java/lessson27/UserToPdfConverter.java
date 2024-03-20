package lessson27;

import com.itextpdf.html2pdf.HtmlConverter;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserToPdfConverter {
    public static void main(String[] args) {
        // Створюємо об'єкт користувача
        User user = new User("Іван", "Іванов", 25);
        // Генеруємо HTML з об'єкта користувача
        String htmlContent = generateHtml(user);
        // Конвертуємо HTML в PDF
        convertHtmlToPdf(htmlContent, "user_info.pdf");
    }

    private static String generateHtml(User user) {
        // Генеруємо HTML за допомогою даних користувача
        return String.format("<html><body><h1>Ім'я: %s</h1><h1>Прізвище: %s</h1><h1>Вік: %d</h1></body></html>",
                user.getFirstName(), user.getLastName(), user.getAge());
    }

    private static void convertHtmlToPdf(String htmlContent, String outputPath) {
        try {
            // Конвертація HTML в PDF
            HtmlConverter.convertToPdf(htmlContent, new FileOutputStream(outputPath));
            System.out.println("PDF згенеровано успішно.");
        } catch (IOException e) {
            System.err.println("Помилка при конвертації в PDF: " + e.getMessage());
        }
    }

    // Клас, що представляє користувача з іменем, прізвищем та віком
    private static class User {
        private String firstName;
        private String lastName;
        private int age;

        public User(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }
}
