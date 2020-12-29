package Alive;

import MoonSurface.JustSurface;
import Other.SpaceBody;
import UsefulThing.*;


public class Crooks extends MoonHabitat {


    public Crooks(String name, SpaceBody homePlanet) {
        super(name, homePlanet);
    }

    public void openHangar(Crooks a, JustSurface.Hangar b) {
        System.out.println("Жулики пытаются открыть " + "Ангар" );
    }



    public void useKnife(Knife knife){
        System.out.println("Жулики роют землю под ангаром с помощью ножа ");
    }


    public void turnOnLantern(Lantern a){
        System.out.println("Жулики включают фонарик");
    }

    public void destroyHangar(JustSurface.Hangar hangar){
        System.out.println("Жулики случайно взрывают Ангар");
        hangar.setDestroyed(true);
    }
}
