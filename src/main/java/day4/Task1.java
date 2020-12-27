package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] num = new int[scan.nextInt()];

        for(int i = 0; i < num.length; i++) {
            num[i] = (int) Math.round(Math.random() * 10);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println(num.length);

        int counter8 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 8)
                continue;
            counter8++;
        }
        System.out.println(counter8);

        int counter1 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1)
                counter1++;
        }
        System.out.println(counter1);

        int countEven = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0)
                counter1++;
        }
        System.out.println(countEven);

        int countOdd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0)
                countOdd++;
        }
        System.out.println(countOdd);

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);

    }
}
