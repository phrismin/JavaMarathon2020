package day6;

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

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear)  {
        if (inputYear < year) return year - inputYear;
        return inputYear - year;
    }
}
