package Array_Questions;

import java.util.Arrays;
import java.util.Random;

public class Reverse {

    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(100);
        }

        Arrays.sort(array);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(array[i]);
//        }

        for (int i = 0; i < 50; i++) {
            int temp = 0;
            temp = array[i];
            array[i] = array[99-i];
            array[99-i] = temp;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
    }
}
