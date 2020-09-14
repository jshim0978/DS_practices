package Array_Questions;

import java.util.*;


public class MissingNumber {
    //How do you find the missing number in a given integer array of 1 to 100?

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int sum = 0;
        int missingNumber = 0;
    //assuming no numbers missing
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
            sum += i+1;
        }
//    //assuming a number missing
//
//        int rand_int = rand.nextInt(101);
//        System.out.println("missing random number = " + rand_int);
//        sum -= rand_int;
//
        int checker = (101)*50;

        if(sum==checker)
            System.out.println("correct");
        else
            missingNumber = checker-sum;
            System.out.println("calculated missingNumber = " + missingNumber);
    //assuming  several missing values
        int several_rand1 = rand.nextInt(101);
        int several_rand2 = rand.nextInt(101);
        System.out.println("generated random integers : " +several_rand1 + "   " +several_rand2);

        array[several_rand1-1] = 0;
        array[several_rand2-1] = 0;

        //sum -= several_rand1 + several_rand2;

        int missing = 0;

        for (int i = 0; i < 99; i++) {
            if (array[i]+1 != array[i+1]) {

                System.out.println("missing numbers are : " + (array[i]+1));
                i++;
            }

        }

    }
}
