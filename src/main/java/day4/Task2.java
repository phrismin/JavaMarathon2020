package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(9999) + 1;
        }

        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];
        int count0 = 0;
        int sum0 = 0;

        for (int i: arr) {
            if (max < i)
                max = i;
            if (min > i)
                min = i;
            if (i % 10 == 0) {
                count0++;
                sum0 += i;
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(count0++);
        System.out.println(sum0);

    }
}
