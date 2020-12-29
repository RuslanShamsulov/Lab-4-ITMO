package MoonSurface;


public class MoonTunnel extends MoonSurface {

    private boolean Icy;

    public boolean getStatus() {
        return Icy;
    }

    public void setStatus(boolean Icy) {
        try {
            this.Icy = Icy;
        } catch (Exception e) {
            System.out.println("Статус boolean ледяной задан неправильно");
        }
    }

    public MoonTunnel(String name, int persentOfOxygen, boolean Icy) {
        super(name, persentOfOxygen);
        this.Icy = Icy;
    }

}
