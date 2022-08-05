package first;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++)
            array[i] = getRandomInt(1, 10);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

    public static int getRandomInt(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min + 1) + min;
    }
}
