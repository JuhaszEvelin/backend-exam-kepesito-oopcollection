package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    //TODO Minden kardforgatónak van pajzsa, amivel kivédi az első őt ért csapást.
    //A pajzs az első kapott sebzés 100%-át felfogja, majd összetörik, tovább nem használható.
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