package day5;

public class Task2 {
    public static void main(String[] args) {

        Motorbike honda = new Motorbike(2015, "Red", "Vulcan");
        System.out.println(honda.getYear() + ", " + honda.getColor() + ", " + honda.getModel());

    }
}

class Motorbike {

    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() { return this.year; }
    public String getColor() { return this.color; }
    public String getModel() { return this.model; }

}
