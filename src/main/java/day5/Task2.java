package day5;
//2. Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

public class Task2 {
    public static void main(String[] args) {

        Motorbike honda = new Motorbike();
        honda.setYear(2015);
        honda.setColor("Red");
        honda.setModel("Vulcan");

        System.out.println(honda.getColor());
        System.out.println(honda.getModel());
        System.out.println(honda.getYear());

    }
}

class Motorbike {

    private int year;
    private String color;
    private String model;

    public void setYear(int year) { this.year = year; }
    public void setColor(String color) { this.color = color; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public String getModel() { return model; }
    public String getColor() { return color; }

}
