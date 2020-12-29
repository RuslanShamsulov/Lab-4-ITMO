package UsefulThing;

import Alive.*;

public class Knife extends UsefulThing{

    public void digTheGround() {
        System.out.println("Используется нож для выкапывания земли");
    }

    public void hurtSomebody(Creature attack, Creature defense ){
        System.out.println(attack.getName() + "атакует ножом" + defense.getName());
    }
}
