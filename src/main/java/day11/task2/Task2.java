package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Hero warrior = new Warrior();
        Hero paladin = new Paladin();
        Hero magician = new Magician();
        Hero shaman = new Shaman();

        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);

        System.out.println(paladin);

    }
}
