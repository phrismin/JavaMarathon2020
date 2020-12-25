package day2;

import java.util.Scanner;
//Вводим в консоли: 7 78
//        Вывод: 15 25 35 45 55 65 75
public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a >= b) System.out.println("Некорректный ввод");

        for (int i = ++a; i < b; i++) {

            if (i % 5 == 0 & i % 10 != 0)
                System.out.print(i + " ");
        }

    }
}
