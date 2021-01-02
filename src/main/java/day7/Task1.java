package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane yack = new Airplane("YACK", 1964, 16, 9);
        Airplane mi = new Airplane("MI", 1993, 17, 15);
        Airplane.compareAirplanes(yack, mi);
    }
}