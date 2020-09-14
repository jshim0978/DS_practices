package Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class duplicateFinder {
    public static Integer[] add2Array(Integer array[], int addend){
        int i;
        List<Integer> newArray = new ArrayList<Integer>(Arrays.asList(array));

        // Add the new element
        newArray.add(addend);

        // Convert the Arraylist to array
        array = newArray.toArray(array);
        return array;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(100);

        }
        Arrays.sort(array);
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
        System.out.println("duplicates~~~");
        Integer [] duplicateArray = new Integer[100];

        for (int i = 0; i < 99; i++) {
            if (array[i] == array[i+1]) {
                System.out.println(array[i]);
                add2Array(duplicateArray,array[i]);
                i++;
            }
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(duplicateArray[i]);
    }


    }
}
