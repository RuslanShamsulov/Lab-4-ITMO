package MoonSurface;

public abstract class MoonSurface {
    protected String name;
    protected int persentOfOxygen;
    protected boolean isOpened = false;


    public MoonSurface(String name, int persentOfOxygen) {
        try {
            this.name = name;
            this.persentOfOxygen = persentOfOxygen;
        } catch (Exception e) {
            System.out.println("Данные  при создании объекта введены некорректно");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersentOfOxygen() {
        return persentOfOxygen;
    }

    public void setPersentOfOxygen(int persentOfOxygen) {
        this.persentOfOxygen = persentOfOxygen;
    }

    public boolean getStatusOfOpenness() {
        return isOpened;
    }

    public void setStatusOfOpenness(boolean a) {

        try {
            isOpened = a;
        } catch (Exception e) {
            System.out.println("Статус введен некорректно ");
        }


    }
}
