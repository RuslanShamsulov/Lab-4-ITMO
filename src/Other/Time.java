package Other;

import Exceptions.NullException;

public class Time {
    private static int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        try {
            this.value = value;
        } catch (Exception e) {
            System.out.println("Значение введено некорректно");
        }
    }

    /**
     * увеличение времени на какое - то число, передаваемое в аргумент
     */
    public void increaseValue(int c) throws NullException{
        if (c != 0) this.value = this.value + c;
        else {
            throw new NullException();
        }

    }



}