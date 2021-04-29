package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    int healthPoint;
    int attackDamage;
    boolean isArmored;

    public MilitaryUnit(int healthPoint, int attackDamage, boolean isArmored) {
        this.healthPoint = healthPoint;
        this.attackDamage = attackDamage;
        this.isArmored = isArmored;
    }

    public MilitaryUnit() {
    }

    public int doDamage() {
        return this.attackDamage;
    }

    public void sufferDamage(int damage) {
        int countedDamage = isArmored ? damage / 2 : damage;
        this.healthPoint = this.healthPoint - countedDamage;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public boolean isArmored() {
        return isArmored;
    }

    public void setArmored(boolean armored) {
        isArmored = armored;
    }

    public int getHitPoints() {
        return getHealthPoint();
    }
}
