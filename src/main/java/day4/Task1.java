package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] num = new int[scan.nextInt()];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) Math.round(Math.random() * 10);
        }

        System.out.println("Введено число " + num.length + ". Сгенерирован следующий массив: " + Arrays.toString(num));

//        Подскажите,как написать метод toString через цикл?

//        System.out.println("Введено число " + (num.length) + ". Сгенерирован следующий массив:");
//        System.out.print("[");
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + ", ");
//        }
//        System.out.println("]");

        System.out.println("Информация о массиве:");

        System.out.println("Длина массива: " + num.length);

        int counter8 = 0;
        int counter1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 8)
                counter8++;
            if (num[i] == 1)
                counter1++;
            if (num[i] % 2 == 0)
                countEven++;
            if (num[i] % 2 != 0)
                countOdd++;
            sum += num[i];
        }

        System.out.println("Количество чисел больше 8: " + counter8);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}