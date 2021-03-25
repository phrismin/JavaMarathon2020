package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "src" + sep + "test" + sep + "resources" + sep + "people.txt";
        System.out.println(parseFileToObjList(new File(path)));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        String[] arrayStr;
        String currentStr;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                currentStr = scanner.nextLine();
                arrayStr = currentStr.split("\\s");
                if (Integer.parseInt(arrayStr[1]) < 0) {
                    throw new Exception();
                }
                personList.add(new Person(arrayStr[0], Integer.parseInt(arrayStr[1])));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (Exception e) {
            System.err.println("Некорректный входной файл");
            return null;
        }
        return personList;
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}