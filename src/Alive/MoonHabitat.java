package Alive;

import Other.*;
import java.util.Objects;

public class MoonHabitat extends Creature implements Feelings {

    private int timeOfExpecting;

    public MoonHabitat(String name, SpaceBody homePlanet) {
        super(name, homePlanet);
    }


    public void increaseTimeOfExpecting() {
    }



    public int getTimeOfExpecting() {
        return timeOfExpecting;
    }

    public void setTimeOfExpecting(int timeOfExpecting) {
        this.timeOfExpecting = timeOfExpecting;
    }

    @Override
    public void believe(Time a) {
        timeOfExpecting = a.getValue();
        if (timeOfExpecting < 3)
            System.out.println("Прошло " + timeOfExpecting + " часа(ов) " + "  Лунатики : Eще ждем, может все-таки вернутся  :) ");
        else
            loseHope();

    }


    @Override
    public void loseHope() {
        System.out.println("Лунатики: Видимо, космонавтов мы не увидим :( ");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MoonHabitat that = (MoonHabitat) o;
        return timeOfExpecting == that.timeOfExpecting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), timeOfExpecting);
    }
}
