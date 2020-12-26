package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();

        switch (city) {
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;

            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;

            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Германия");
                break;

            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;

            case "Stop":
                break;

            default:
                System.out.println("Неизвестная страна");
        }
    }
}
