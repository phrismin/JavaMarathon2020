package day16;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path1 = "src" + sep + "main" + sep + "resources" + sep + "file1.txt";
        String path2 = "src" + sep + "main" + sep + "resources" + sep + "file2.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1));
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file1)));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2));
            file1.createNewFile();
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                bw1.write(String.valueOf(random.nextInt(100)));
                bw1.write(" ");
            }
            bw1.close();
            file2.createNewFile();
            String[] array;
            double currentSum = 0;
            int count = 0;
            while (scanner.hasNext()) {
                array = scanner.nextLine().split(" ");
                for (String s : array) {
                    currentSum += Integer.parseInt(s);
                    count++;
                    if (count == 20) {
                        bw2.write(String.valueOf(currentSum / count));
                        bw2.write(" ");
                        currentSum = 0;
                        count = 0;
                    }
                }
            }
            scanner.close();
            bw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printResult(file2);
    }

    public static void printResult(File file2) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file2)))) {
            String[] array;
            double sum = 0;
            while (scanner.hasNext()) {
                array = scanner.nextLine().split(" ");
                for (String s : array) {
                    sum += Double.parseDouble(s);
                }
            }
            int res = (int) sum;
            System.out.println(res);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}