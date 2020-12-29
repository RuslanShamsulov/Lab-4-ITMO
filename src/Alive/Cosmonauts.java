package Alive;

import MoonSurface.*;
import Other.*;
import UsefulThing.*;

public class Cosmonauts extends Creature implements OvercomeBarrier, Feelings {

    private int distance; // отдаление как сумма высоты и дистанции по горизонтали
    private int height; //отдаление по высоте

    public Cosmonauts(String name, SpaceBody homePlanet) {
        super(name, homePlanet);
    }


    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        if (distance >= 0)
            this.distance = distance;
        else {
            System.out.println("Дистанция введена неверно ");
        }
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        if (height >= 0) {
            this.height = height;
            this.distance = this.distance + height;
        } else
            System.out.println("Дистанция введена неверно ");


    }


    public void turnIntoPoint() {
        if (this.distance >= 100) {
            System.out.println("Космонавты поднялись так высоко, что с виду похожи на точку! ");
        } else {
            System.out.println("Нас все еще видно, издалека мы еще не точка ");
        }
    }


    @Override
    public void loseHope() {
        System.out.println("Видимо, мы не доберемся домой :( ");
    }

    @Override
    public void believe(Time a) {
        System.out.println("Прошло уже " + a.getValue() + " , но мы космонавты и мы всегда верим в своим силы! ");
    }


    public void overcome(IceDestroyer icedestroyer, MoonSurface currentSurface, MoonSurface shouldBeOvercomed) {
        useIceDestroyer(icedestroyer, currentSurface, shouldBeOvercomed);

    }

    private void useIceDestroyer(IceDestroyer icedestroyer, MoonSurface currentSurface, MoonSurface ShouldBeOvercomed) {
        System.out.println("Космонавты начинают использовать ледорубы");
        icedestroyer.destroy(currentSurface, ShouldBeOvercomed);
        icedestroyer.setDestroyed(true);
    }


    public void getAccessToJustSurface(Cave a) {  // аргумент - объект класса пещеры, для того чтобы проверить открыта ли она для выхода на Луну
        if (a.getStatusOfOpenness() == true) {
            System.out.println("Доступ к поверхноти Луны получен, задача выполнена ");
        } else {
            System.out.println("Сначала нужно открыть пещеру ");
        }


    }

    public void checkShip(Creature creature,Ship ship){
        System.out.println(creature.getName() + " проверяют корабль " + ship.getName() + " в ангаре, чтобы скорее отправиться на Землю");
    }

    public void endCheck(Creature creature,Ship ship){
        System.out.println(creature.getName() + " закончили проверять корабль " + ship.getName() + " и возвратились на базу");
    }


    public void giveDrawingOfShip(MoonScientists b){
        System.out.println(" Космонавты с Земли дарят чертежи рокеты для " + b.getName() );
    }

    public void giveMinerals(Minerals minerals){
        System.out.println("Космонавты дарят " + minerals);
    }

    public void giveMinerals(Minerals a, Minerals b){
        System.out.println("Космонавты дарят " + a + " и " + b);
    }

    public  void cleanUp() {
        System.out.println("Космонавты наводят порядок");
    }

}
