package day6;

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

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear)  {
        if (inputYear < year) return year - inputYear;
        return inputYear - year;
    }
}
