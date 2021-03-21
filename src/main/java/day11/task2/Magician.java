package day11.task2;

public class Magician extends Hero {

    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
