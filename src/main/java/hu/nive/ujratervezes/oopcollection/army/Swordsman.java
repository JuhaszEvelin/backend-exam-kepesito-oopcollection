package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    boolean isFirstHit = true;

    public Swordsman(boolean isArmored) {
        super(100, 10, isArmored);
    }

    @Override
    public void sufferDamage(int damage) {
        int countedDamage = isArmored ? damage / 2 : damage;
        if (isFirstHit) {
            countedDamage = 0;
            isFirstHit = false;
        }
        this.healthPoint = this.healthPoint - countedDamage;
    }
}