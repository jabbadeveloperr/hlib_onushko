package lessson18;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.s(1, 3));
        System.out.println(main.sum(1, 3));

        String t = "I love my d&d team t";
        int c = main.getC(t,"t");
        System.out.println(c);
       ///прибрати права
        //вдалити
        //перевірити кількість файлів
        //сформувати лист на емейл
        //відправка повідомлення до специфічних юзерів


    }
    private   int getSymbolCountAndChangeText(String text, char symbol) {
        String[] symbols = text.split("");
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
   if (symbols[i].equals(symbol)) {
       count++;
   }
        }
        ///
        ///
        ///
        ///

        return count;
    }
    private static int getC(String t, String ch) {
        String[] w = t.split("");
        int c = 0;
        for (int i = 0; i < t.length(); i++) {
   if (w[i].equals(ch)) {
       c++;
   }
        }
        return c;
    }

    double s(double a, double b) {
        double s = a + b;
        return s;
    }

    double sum(double first, double second) {
        return first + second;
    }
}
