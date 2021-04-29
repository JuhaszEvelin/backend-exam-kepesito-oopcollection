package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){
        army.add(militaryUnit);
    }

    //TODO ami a sereg minden egységének életerejéből levonja a paraméterül kapott értéket,
    //valamint eltávolítja a seregből azokat az egységeket, melyeknek így 25 pont alá csökkent az életerejük
    //(azaz harcképtelenek vagy halottak),
    public void damageAll(int damage){

    }

    //TODO ami visszaadja, hogy az aktuális támadással mennyi sebzést okoz a sereg összesen,
    public int getArmyDamage(){
        return 0;

    }

    public int getArmySize(){
        return army.size();
    }

}