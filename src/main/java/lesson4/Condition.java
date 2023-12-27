package lesson4;

public class Condition {
    public static void main(String[] args) {
//        boolean b1 = true;
//        boolean b2 = false;
//
//        System.out.println(b1);

//        if (false){
//            System.out.println("Тру спрацювало!");
//        }else {
//            System.out.println("Елс спрацювало");
//        }

//        double money = -5;
//        //воно йде по if і шукає першу true і виконує її
//        // == це знак порівняння
//        if (money > 0) {
//            System.out.println("В нас є якісь гроші");
//        } else if (money < 0 && money != -5) {//повернувся перший true, тут, а потім тут знак &&
//            System.out.println("в нас борг");
//        } else if (money == -5) { // тут теж true, але до нього не дійшло, бо це частний випадок від money < 0
//            System.out.println("В нас борг на 5 Євро");
//        } else {
//            System.out.println("Боргу немає як і грошей взагалі");
//        }
        double money = -5;
        //воно йде по if і шукає першу true і виконує її
        // == це знак порівняння
        if (money > 0) {
            System.out.println("В нас є якісь гроші");
        } else if (money == -5) { // тут теж true, але до нього не дійшло, бо це частний випадок від money < 0
            System.out.println("В нас борг на 5 Євро");
        } else if (money < 0) {//повернувся перший true, тут
            System.out.println("в нас борг");
        } else {
            System.out.println("Боргу немає як і грошей взагалі");
        }
    }
}
