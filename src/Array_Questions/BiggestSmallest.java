package Array_Questions;

import java.util.Arrays;
import java.util.Random;

public class BiggestSmallest {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(100);
        }

        Arrays.sort(array);
        System.out.println(array[0] + "  " + array[99]);


    }

}
