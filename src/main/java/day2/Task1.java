package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num >= 1 && num <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (num >= 5 && num <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (num >= 9) {
            System.out.println("Многоэтажный дом");
        } else System.out.println("Ошибка ввода");

    }
}
