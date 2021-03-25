package day15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String sep = File.separator;
        String pathInput = "src" + sep + "main" + sep + "resources" + sep + "shoes.csv";
        String pathOutput = "src" + sep + "main" + sep + "resources" + sep + "missing_shoes.txt";
        File fileInput = new File(pathInput);
        File fileOutput = new File(pathOutput);
        String[] arrayStr;
        String currentStr;
        try (Scanner scanner = new Scanner(fileInput);
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput))) {
            while (scanner.hasNext()) {
                currentStr = scanner.nextLine();
                arrayStr = currentStr.split(";");
                if (Integer.parseInt(arrayStr[2]) == 0) {
                    bw.write(currentStr);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}