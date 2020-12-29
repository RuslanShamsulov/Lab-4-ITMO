package Alive;

import Other.*;

public class Doctor extends MoonHabitat {
    public Doctor(String name, SpaceBody homePlanet) {
        super(name, homePlanet);
    }

    public void doArtificialRespiration(Creature whoNeedHelp){
        System.out.println("Доктор делает искусственное дыхание для " + whoNeedHelp.getName() );

    }

    public  void giveAmmonial(Creature whoNeedHelp){
        System.out.println("Доктор дает понюхать ношатырь для " + whoNeedHelp.getName());
        System.out.println(whoNeedHelp.getName() + " просыпается");
    }

}
