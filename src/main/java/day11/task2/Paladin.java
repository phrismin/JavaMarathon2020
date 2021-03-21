package day11.task2;

public class Paladin extends Hero implements Healer {
    private int HEAL_HIMSELF = 25;
    private int HEAL_TEAMMATE = 10;
    private final int HEAL_MAX = 100;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEAL_HIMSELF > HEAL_MAX) {
            health = HEAL_MAX;
        } else {
            health += HEAL_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > HEAL_MAX) {
            hero.health = HEAL_TEAMMATE;
        } else {
            hero.health += HEAL_TEAMMATE;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
