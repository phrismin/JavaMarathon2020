package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane yack = new Airplane("USSR", 1940, 9, 3);
        yack.setYear(1941);
        yack.setLength(8);
        yack.fillUp(150);
        yack.fillUp(300);
        yack.info();

    }
}

class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    void fillUp(int n) {
       this.fuel = n;
    }

    public void setProducer(String producer) { this.producer = producer; }
    public void setYear(int year) { this.year = year; }
    public void setLength(int length) { this.length = length; }
    public void setWeight(int weight) { this.weight = weight; }
    public void setFuel(int fuel) { this.fuel = fuel; }

    public int getFuel() { return this.fuel; }
}