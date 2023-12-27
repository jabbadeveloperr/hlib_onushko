package lesson14;

import java.util.ArrayList;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(36);
        list.add(18);

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
//      list.remove(Integer.valueOf(36)); //вдалення по значенню по числу
        list.add(18);
        list.add(18);
        list.add(18);
        System.out.println(list);
        list.remove(0);
        list.remove(3);
        System.out.println(list);///додавати массив в список хз як
        list.trimToSize();


        int[] array = {1, 2, 3, 4, 5, 6, 8};
        int[] array2 = new int[16];

        System.arraycopy(array2, 0, array, 0, array.length);
        array = array2;

    }
}
