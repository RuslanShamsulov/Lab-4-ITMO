package Alive;

import MoonSurface.JustSurface;
import Other.*;

public class MoonScientists extends MoonHabitat {
    public MoonScientists(String name, SpaceBody homePlanet) {
        super(name, homePlanet);
    }

    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void arriveForKnowledge(JustSurface.MoonCity moonCity){
        System.out.println("Ученые с Луны прибывают в космический городок, чтобы получить знания");
    }
}
