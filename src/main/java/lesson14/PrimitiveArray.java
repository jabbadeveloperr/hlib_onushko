package lesson14;

import java.util.Arrays;

public class PrimitiveArray {
    public static void main(String[] args) {
        int[] friends = {18, 36, 15};
        System.out.println(Arrays.toString(friends));
        friends[0] = 19;
        System.out.println(Arrays.toString(friends));
        friends[1] = 37;
        System.out.println(Arrays.toString(friends));
        friends[2] = 0;
        System.out.println(Arrays.toString(friends));

        System.out.println(friends.length);
        int count = 0;
        for (int i : friends) {
            if (i != 0) {
                count++;
            }
        }

        System.out.println("friend count:" + count);

        friends = new int[]{friends[0], friends[1]};

        System.out.println("new friend count:" + friends.length);
        System.out.println(Arrays.toString(friends));

    }
}
