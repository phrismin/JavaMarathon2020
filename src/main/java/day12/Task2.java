package day12;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> listEvenNumbers = new LinkedList<>();
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                listEvenNumbers.add(i);
            }
        }
        for (int i = 300; i < 351; i++) {
            if (i % 2 == 0) {
                listEvenNumbers.add(i);
            }
        }
        System.out.println(listEvenNumbers);
    }
}
