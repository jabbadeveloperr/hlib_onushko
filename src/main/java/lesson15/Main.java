package lesson15;

import lesson16.AgeChanger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Big O  = O(n)
        // O (1) - константна
        // O (log(n) ) логарифмічна складність - классний пошук по відсотованим даннним
        // O (n) - лінійна складність
        // O (n^2) - квадратична складність

        // 2 3 5 7 99 1 0 8 3 - O (n) лінійна складність коли по всім елементам
        // 2 3 5 7 99 1 0 8 3 - O (1) константна складність get(5)
        //[1, 3, 5, 6, 7, 8]
        // for (i : 10) { for {i : 10} } - O(n^2)
        // for - O(n)
        // 1 2 3 4 5 6 | 7 8 9 10 [11] 12
        // 7 8 9 | 10 [11] 12
        // 10 |[11] 12  - log(n)


        // [7] 1 2 4 5 6 7 8 9 10 11 12 13 | O (n)
        LinkedList <String> array = new LinkedList<>();
        array.add("123");
        array.add("Дом");
        array.add("ad");
        array.remove(0);
        System.out.println(array);

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("Дом");
        arrayList.add("ad");
        arrayList.remove(0);

        // elem2 = element1.next
        // elem3 = elem2.next

        System.out.println(arrayList);
    }

}
