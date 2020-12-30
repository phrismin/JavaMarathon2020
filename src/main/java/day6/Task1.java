package day6;

public class Task1 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setColor("Black");
        ford.setModel("Escort");
        ford.setYear(2000);
        ford.info();
        System.out.println(ford.yearDifference(5000));

        Motorbike honda = new Motorbike(2015, "Vulcan", "Red");
        honda.info();
        System.out.println(honda.yearDifference(2021));
    }
}
