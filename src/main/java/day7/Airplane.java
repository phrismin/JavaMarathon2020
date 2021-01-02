package day7;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    public void fillUp(int n) {
       this.fuel = +n;
    }

    public void setProducer(String producer) { this.producer = producer; }
    public void setYear(int year) { this.year = year; }
    public void setLength(int length) { this.length = length; }
    public void setWeight(int weight) { this.weight = weight; }
    public void setFuel(int fuel) { this.fuel = fuel; }
    public int getFuel() { return this.fuel; }

    public static void compareAirplanes(Airplane yack, Airplane mi) {
        if (yack.length > mi.length) {
            System.out.println("Airplane " + yack.producer + " is longer: " + yack.length);
        } else if (yack.length < mi.length) {
            System.out.println("Airplane " + mi.producer + " is longer: " + mi.length);
        } else
            System.out.println("Airplaines are equals");
    }
}