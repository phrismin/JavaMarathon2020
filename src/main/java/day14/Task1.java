package day14;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "src" + sep + "test" + sep + "resources" + sep + "test.txt";
        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String currentStr;
            String[] array;
            int sum = 0;
            while ((currentStr = bufferedReader.readLine()) != null) {
                array = currentStr.split("\\s");
                try {
                    if (array.length != 10) {
                        throw new IOException();
                    }
                    for (String i : array) {
                        sum += Integer.parseInt(i);
                    }
                    System.out.println(sum);
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл!");
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        }
    }
}