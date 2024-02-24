package lessson26;

public class Retro {
    public static void main(String[] args) {
        //Прості типи
        //Цілі
        byte byteNumber = 127;
        short sh = 123;
        int number = 1;
        long lNumber = 13;
        System.out.println(1231231231231231231l);
        //З плаваючую точкою
        double doubleNumber = 1.34;
        float floatNumber = 1.23f;

        //Символні
        char ch = 'g';
        char ch2 = '\323';
        System.out.println(ch2);

        //Логічні
        boolean b = true;
        /// operator condishinal
        if (false) {

        } else {

        }

        if (true) {
            System.out.println("if1");
        }
        if (true) {
            System.out.println("if2");
        }

        if (true) {
            System.out.println("if3");
        } else if (true) {
            System.out.println("if4");
        } else if (true) {
            System.out.println("if5");
        } else {
            System.out.println("else");
        }
        //loop
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

//        while ("немає запаху моря") {
//            //роби крок
//        }
//
//        for (; "немає запаху моря" ; ) {
//           //роби крок
//
//        }
        int k = 666;
        do {
            System.out.println("отримай стипендію");
            k++;
        } while (k < 5);

    }
}
