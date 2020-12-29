package UsefulThing;

import Exceptions.NegativeInput;
import MoonSurface.*;

public class Ship extends UsefulThing {

    private int speed;

    public Ship(String name, boolean deviceInUse, int speed) {
        super(name, deviceInUse);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    static void moveShip(MoonSurface type, Ship ship, int speed) {
        if (speed > 0) {
            ship.setSpeed(speed);
            System.out.println("Корабль движется по поверхности " + type.getName() + "со скоростью " + speed + " км/ч");
        } else
            System.out.println("Задана некорректная скорость корабля");


    }




      public static class Propeller {
        private int airDensity; // плотность воздуха


        public int getAirDensity() {
            return airDensity;
        }

        public void setAirDensity(int airDensity) {
            try {
                this.airDensity = airDensity;
            } catch (Exception e) {
                System.out.println("Установлено неправильное значение плотности воздуха");
            }
        }

        public void makeTraction(MoonSurface type, Ship ship, int speed) { // На какой поверхности, какой корабль, с какой скоростью
            if (type.getPersentOfOxygen() > 60) {
                System.out.println("Двигатель создает достаточную тягу");
            } else {
                System.out.println("Двигатель создает слабую тягу");
            }
            moveShip(type, ship, speed);
        }


    }


    public static class Accumulator{
        int persentage;
        public void chargeAccumulator(int value) throws NegativeInput{
            if (value < 0 ) throw new NegativeInput("значение аккумулятора меньше нуля");
            this.persentage=this.persentage+value;
        }
        public void checkButtery(){
            if (persentage > 60) {
                System.out.println("Аккумулятор заряжен - ракета может лететь");
            }
                else {
                    System.out.println("Аккумулятор разряжен - ракета не может лететь");

            }
        }
    }

    public void checkGassRoom(){

        class GassRoom{
            int numOfBalloons=7;
            public void checkBalloons(){
                if (numOfBalloons > 1) {
                    System.out.println("Найдены баллоны с кислородом, можно оказать первую помощь ");
                    System.out.println("Даны баллоны с кислородом, состояние здоровье становится лучше");
                }
                else {
                    System.out.println("к сожалению, газовых баллонов не осталось");
                }

            }

        }
        GassRoom ourGassRoom = new GassRoom();

        ourGassRoom.checkBalloons();
    }











}
