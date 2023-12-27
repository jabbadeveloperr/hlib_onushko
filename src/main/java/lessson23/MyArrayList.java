package lessson23;

import java.util.Arrays;

public class MyArrayList {
    String[] array = new String[10];

    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "lol1";
        arr[1] = "lol2";
        arr[2] = "lol3";

        System.out.println(Arrays.toString(arr));


        MyArrayList list = new MyArrayList();
        list.add("lol");
        list.add("kek");
        list.add("lol");
        list.add("kek");
        list.add("lol");
        list.add("kek");
        System.out.println(list);

    }

    String add(String item) {
        array[0] = item;
        return item;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
