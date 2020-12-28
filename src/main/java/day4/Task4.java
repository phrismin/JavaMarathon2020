package day4;

//4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Найти максимум среди сумм трех соседних элементов.
//        Для найденной тройки с максимальной суммой выведите значение суммы и
//        индекс первого элемента тройки.
//
//        Пример:
//        *Для простоты пример показан на массиве размера 10
//
//        [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//
//        Тройка с максимальной суммой: [8742, 1040, 3254]

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(9999) + 0;
        }

        int sumCurrent = 0;
        int sumFinal = 0;
        int index = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            sumCurrent = arr[i] + arr[i+1] + arr[i+2];
            if (sumFinal < sumCurrent) {
                sumFinal = sumCurrent;
                index = i;
            }
        }

        System.out.println(sumFinal);
        System.out.println(index);

    }
}
