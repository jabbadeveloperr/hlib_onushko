package lesson6;

public class SearchMin {
    public static void main(String[] args) {
        int [] arr = {-4, 12, -5, 13, 2};
        System.out.println("Останній:"+ arr[4]);
//        System.out.println(arr.length);
//        System.out.println(array.length);
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
        int min = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (i < arr.length) {
                System.out.println("i, тобто " + i
                        + " менша за arr.length тобто "
                        + (arr.length));
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);


    }
}