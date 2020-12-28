package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] arr = new int[12][8];
        Random rand = new Random();

        int maxSumString = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int sumString = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(49) + 0;
                sumString += arr[i][j];
            }
            if (sumString > maxSumString) {
                maxSumString = sumString;
                index = i;
            }
        }

        System.out.println("Ответ: " + index + " (индекс строки, сумма чисел в которой максимальна)");

    }
}
