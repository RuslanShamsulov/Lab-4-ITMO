package MoonSurface;


public class Cave extends MoonSurface {

    private int deep;

    public Cave(String name, int persentOfOxygen, int deep) {
        super(name, persentOfOxygen);
        this.deep = deep;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        try {
            this.deep = deep;
        } catch (Exception e) {
            System.out.println("Глубина пещеры задана неправильно");
        }
    }
}
