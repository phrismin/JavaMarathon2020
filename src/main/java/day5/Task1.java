package day5;

//1. Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого из полей, используя get методы.
//        Созданный вами класс должен отвечать принципам инкапсуляции.


public class Task1 {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.setColor("Black");
        ford.setModel("Escort");
        ford.setYear(2000);

        System.out.println(ford.getColor());
        System.out.println(ford.getModel());
        System.out.println(ford.getYear());

    }
}

class Car {

    private int year;
    private String color;
    private String model;

    public void setYear(int yearOfIssue) {
        year = yearOfIssue;
    }
    public void setColor(String colorAuto) {
        color = colorAuto;
    }
    public void setModel(String modelAuto) {
        model = modelAuto;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

}
