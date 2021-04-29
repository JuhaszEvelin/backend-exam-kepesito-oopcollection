package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    boolean isFirstAttack = true;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    public int doDamage() {
        if (isFirstAttack){
            isFirstAttack = false;
            return this.attackDamage * 3;
        }
        return this.attackDamage;
    }
}