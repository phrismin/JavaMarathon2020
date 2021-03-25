package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "src" + sep + "main" + sep + "resources" + sep + "people.txt";

        System.out.println(parseFileToStringList(new File(path)));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            String[] arrayStr;
            String currentStr;
            while (scanner.hasNext()) {
                currentStr = scanner.nextLine();
                arrayStr = currentStr.split("\\s");
                if (Integer.parseInt(arrayStr[1]) < 0) {
                    throw new Exception();
                }
                list.add(currentStr);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (Exception e) {
            System.err.println("Некорректный входной файл");
            return null;
        }
        return list;
    }
}
