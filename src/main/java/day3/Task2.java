package day3;

//1 2 - ваш ввод в консоль
//        0.5 - ответ программы
//        100 77 - ваш ввод в консоль
//        1.2987012987012987 - ответ программы
//        3 0 - ваш ввод в консоль
//        работа программы завершается


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        double res;

        while (true) {
            a = scan.nextDouble();
            b = scan.nextDouble();
            if (b == 0)
                break;
            res = a / b;
            System.out.println(res);
        }

    }
}
