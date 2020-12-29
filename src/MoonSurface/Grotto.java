package MoonSurface;


public class Grotto extends MoonSurface {

    private boolean hasIcicles;


    public Grotto(String name, int persentOfOxygen) {
        super(name, persentOfOxygen);
    }


    public boolean getStatusOfIcicles() {
        return hasIcicles;
    }

    public void setStatusIcicles(boolean hasIcicles) {
        this.hasIcicles = hasIcicles;
    }
}
