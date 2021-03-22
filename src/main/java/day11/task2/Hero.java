package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    int health;
    double physAtt;
    double physDef;
    double magicDef;
    int magicAtt;

    public Hero () {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackHero = physAtt * (1 - hero.physDef);
        if (hero.health - attackHero < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackHero;
        }
    }
}
