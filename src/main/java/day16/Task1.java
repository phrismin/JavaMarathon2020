package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Formatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "src" + sep + "test" + sep + "resources" + sep + "test.txt";
        File file = new File(path);
        String res = printResult(file);
        System.out.printf(res);
    }

    public static String printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            double sum = 0;
            String[] array;
            int count = 0;
            while (scanner.hasNext()) {
                array = scanner.nextLine().split("\\s");
                for (int i = 0; i < array.length; i++) {
                    sum += Double.parseDouble(array[i]);
                    count++;
                }
            }
            double resDouble = sum / count;
            BigDecimal bd = new BigDecimal(resDouble);
            bd = bd.setScale(3, RoundingMode.HALF_UP);
            double newResDouble = bd.doubleValue();
            return resDouble + " --> " + newResDouble;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}