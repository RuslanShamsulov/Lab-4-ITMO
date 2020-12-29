package Alive;

import Other.*;

public class Leader extends Cosmonauts{
    public Leader(String name, SpaceBody homePlanet) {
        super(name, homePlanet);
    }

    public void splitIntoTeams(Leader leader){
        System.out.println(leader.getName()+ " делит группу на несколько команд");
    }

    public void command(Leader leader, String whatToDo) {
        System.out.println(leader.getName() + " приказывает : " + whatToDo);
    }


}
