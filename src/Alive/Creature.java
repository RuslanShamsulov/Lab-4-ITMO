package Alive;

import Other.*;
import java.util.Objects;


public abstract class Creature {
    protected String name;
    protected SpaceBody homePlanet;

    public String getName() {
        return name;
    }

    public Creature(String name, SpaceBody homePlanet) {
        this.name = name;
        this.homePlanet = homePlanet;
    }

    public Enum getHomePlanet() {
        return homePlanet;
    }

    public void seeCosmonauts(Creature a) {

        System.out.println(a.getName() + " видят космонавтов!");
    }

    public void comeBack() {
        System.out.println(" Возвращаемся");
    }

    public void goToTheTop() {
        System.out.println(" Поднимаемся наверх");
    }


    public void goToCave() {
        System.out.println("Направляемся в пещеру");
    }

    public void hideAway() {
        System.out.println("Скрываемся из виду ! ");
    }



    public void GoSleep(Creature creature){
        System.out.println(creature.getName() + " ложится спать");
    }

    public void FeelBad(Creature creature){
        System.out.println(creature.getName() + " чувствует себя плохо");
    }

    public void empathize(Creature a, Creature b){
        System.out.println(a.getName() + " сопереживает "+b.getName() );
    }

    public void seeHomePlanet(Creature creature){
        System.out.println("Мы видим родную планету - " + creature.getHomePlanet());
    }

    public void seeBurningHangar() {
        System.out.println("О нет, кажется горит Амбар!");
    }

    public class Heart{
        public void stop(){

            System.out.println("Сердце у "+ name + " Остановилось");
        }
        public void start() {
            System.out.println("Сердце у "+ name + " снова начало биться");
        }
    }




    @Override
    public String toString() {
        return "Alive.Creature{" +
                "name='" + name + '\'' +
                ", homePlanet=" + homePlanet +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return Objects.equals(name, creature.name) &&
                Objects.equals(homePlanet, creature.homePlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, homePlanet);
    }


}