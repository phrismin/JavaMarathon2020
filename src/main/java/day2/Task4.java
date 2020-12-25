package day2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        if (x >= 5) {
            double y = (pow(x, 2) - 10) / (x + 7);
            System.out.println(y);
        }

        else if (x > -3 & x < 5) {
            double y  = (x + 3) * (pow(x, 2) - 2);
            System.out.println(y);
        }

        else System.out.println(420.0);

    }
}
