package day12;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listAutos = new LinkedList<>(List.of("Opel", "Lada", "Ford", "Mazda", "Porsche"));
        for (String auto : listAutos) {
            System.out.println(auto);
        }
        int middleList = listAutos.size() / 2;
        listAutos.add(middleList, "VW");
        listAutos.remove(0);
        for (String auto : listAutos) {
            System.out.println(auto);
        }
    }
}
