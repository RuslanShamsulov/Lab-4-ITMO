import Exceptions.*;
import MoonSurface.*;
import Other.*;
import Alive.*;
import UsefulThing.*;



public class Solution {
    public static void main(String[] args) {
    Cosmonauts ourcosmonauts = new Cosmonauts("Космонавты ",SpaceBody.EARTH);
    MoonHabitat ourmoonHabitat = new MoonHabitat("Ребята с Луны", SpaceBody.MOON);
    Ship ourShip = new Ship("Восток ", false, 0 );
    MoonScientists ourMoonScientists = new MoonScientists("Ученые с Луны", SpaceBody.MOON);


        /*Кусочек ниже реализует прибытие лунных ученых в Космический городок*/
    JustSurface.MoonCity moonCity = new JustSurface.MoonCity();
    ourMoonScientists.arriveForKnowledge(moonCity);
    ourcosmonauts.giveDrawingOfShip(ourMoonScientists);
    ourcosmonauts.giveMinerals(Minerals.LUNIT, Minerals.ANTILUNIT);


        /*Кусочек ниже реализует проверку Космонавтами ракеты*/
    ourcosmonauts.checkShip(ourcosmonauts,ourShip);
    ourcosmonauts.endCheck(ourcosmonauts,ourShip);


        /*Кусочек ниже реализует прибытие жуликов в ангар*/
    JustSurface.Hangar ourHangar = new JustSurface.Hangar();
    Crooks Ourcrooks = new Crooks("Жулики",SpaceBody.MOON );
    Ourcrooks.openHangar(Ourcrooks,ourHangar);
    Knife ourKnife = new Knife();
    Ourcrooks.useKnife(ourKnife);
    Lantern ourLantern = new Lantern();
    Ourcrooks.turnOnLantern(ourLantern);


    /* использование анонимного класса для реализации взрыва ангара*/
    CanExplode boom = new CanExplode() {
        @Override
        public void explode() {
            Ourcrooks.destroyHangar(ourHangar);
            System.out.println("Происходит взрыв ангара");
        }
    };
    boom.explode();

    System.out.print("Космонавты говорят: ");
    ourcosmonauts.seeBurningHangar();
    ourcosmonauts.cleanUp();


    /*проводы космонавтов*/
    System.out.println("Наступает полдень следующего дня ");
    Neelovsi ourNeelovsi = new Neelovsi("Жители деревни - Нееловцы",SpaceBody.MOON);
    ourNeelovsi.wishGoodLuck();

    Cosmonauts neznaika = new Cosmonauts("Незнайка",SpaceBody.EARTH);
    neznaika.FeelBad(neznaika);
    System.out.println("Космонавты начали улетать от жителей Луны");



    ourcosmonauts.turnIntoPoint();  // высота равно нулю по умолчанию, поэтому еще не превратились в точку
    ourmoonHabitat.seeCosmonauts(ourmoonHabitat); // Лунатики еще видят космонавтов
    ourcosmonauts.setHeight(200);   // устанавливаем высоту космонавтам
    System.out.println("Высота космонавтов: "+ ourcosmonauts.getHeight());




    ourcosmonauts.turnIntoPoint();  // вызываем метод для проверки превратились ли в точку
    ourcosmonauts.hideAway();   // вызываем метод для проверки скрылись ли космонавты из вида
    Time ourtime = new Time();
    try {ourtime.increaseValue(1);  // увеличиваем значение времени на 1
    } catch (NullException e) {
        System.out.println(e.getMessage());
    }

        ourmoonHabitat.believe(ourtime); // проверка верят ли еще лунатики в возвращение космонавтов
    ourtime.increaseValue(1); // увеличиваем значение времени на единицу
    ourmoonHabitat.believe(ourtime);
    ourtime.increaseValue(1);
    ourmoonHabitat.believe(ourtime);
    System.out.println("Прошло уже " + ourmoonHabitat.getTimeOfExpecting() + " часа(ов) ожидания");


    MoonTunnel ourMoonTunnel = new MoonTunnel("Ледяной туннель", 10, true); // создаем объект туннель,% кислорода =10, ледяной = правда
    Grotto ourGrotto = new Grotto("Сосульчатый грот", 70); // создаем объект Грот, процент кислоорда 70
    ourGrotto.setStatusIcicles(true); // Гротто сосульчатый
    Cave ourCave = new Cave("Пещера", 70,1500); // создаем объект пещера, процент кислорода 70,глубина 1500
    Ship.Propeller ourPropeller = new Ship.Propeller();
    ourPropeller.makeTraction(ourMoonTunnel, ourShip, 110); // создаем тягу на поверхности ледяной туннель для нашего кораблся, скорость 60
    ourShip.setDeviceInUse(true); //Меняем статус корабля на "используется"

    IceDestroyer ourIceDestroyer = new IceDestroyer("Bosh", false, false); //создаем объект ледокол
    ourIceDestroyer.setDeviceInUse(true); // Меняем статус ледоруба на "используется"
    ourcosmonauts.overcome(ourIceDestroyer,ourMoonTunnel, ourGrotto ); // передаем в качестве аргументов "какой ледоруб","откуда надо выбраться","куда попасть"
    ourcosmonauts.goToCave();
    ourcosmonauts.overcome(ourIceDestroyer,ourGrotto, ourCave ); // повторяем для попадания в пещеру из гротто
    JustSurface ourJustSurface = new JustSurface("Поверхность Луны ", 80);  // создаем объект поверхность Луны, процент кислоорда 80
    ourcosmonauts.getAccessToJustSurface(ourCave);
    ourJustSurface.setFlagOnSurface("РОССИЯ! ");
    System.out.println("На поверхности луны установлен флаг " + ourJustSurface.getFlagOnSurface());

    /*Переопределенные equals,toString,hashCode*/
    System.out.println("Переопределенные equals,toString,hashCode");
    System.out.println(ourcosmonauts.toString());
    MoonHabitat ourmoonHabitat2 = new MoonHabitat("Ребята с Луны", Other.SpaceBody.MOON); // создал чтобы показать работу equals
    ourmoonHabitat2.setTimeOfExpecting(3);
    System.out.println(ourmoonHabitat.equals(ourmoonHabitat2)); //сравнение двух объектов класса MoonHabitat



    Leader Znaika = new Leader("Знайка",SpaceBody.EARTH);
    Znaika.splitIntoTeams(Znaika);
    Znaika.command(Znaika,"доставить Незнайку в ракету" );


    Ship.Accumulator ourAccumulalor = new Ship.Accumulator();
    ourAccumulalor.checkButtery();

        try {
            ourAccumulalor.chargeAccumulator(80);
        } catch (NegativeInput negativeInput) {
            System.err.println(negativeInput.getMessage());
        }

        System.out.println("Проходит 12 часов подзарядки");
    ourAccumulalor.checkButtery();
    ourPropeller.makeTraction(ourJustSurface,ourShip,110);


    neznaika.FeelBad(neznaika);
    Doctor ourDoctor = new Doctor("Доктор Пилюлькин",SpaceBody.EARTH);
    ourDoctor.empathize(ourDoctor,neznaika);
    neznaika.GoSleep(neznaika);
    ourDoctor.giveAmmonial(neznaika);
    neznaika.GoSleep(neznaika);
    Creature.Heart heartOfNeznaika = neznaika.new Heart();
    heartOfNeznaika.stop();
    ourDoctor.doArtificialRespiration(neznaika);
    heartOfNeznaika.start();
    ourShip.checkGassRoom();

    ourcosmonauts.seeHomePlanet(ourcosmonauts);

    System.out.println("Миссия закончилась");

    }
}
