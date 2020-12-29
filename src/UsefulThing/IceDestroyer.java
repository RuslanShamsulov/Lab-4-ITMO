package UsefulThing;

import MoonSurface.*;


public class IceDestroyer extends UsefulThing {
    private boolean destroyed = false;

    public IceDestroyer(String name, boolean deviceInUse, boolean destroyed) {
        super(name, deviceInUse);
        this.destroyed = destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void destroy(MoonSurface currentSurface, MoonSurface ShouldBeOvercomed) {
        System.out.println("С помощью ледоруба нужно выбраться из " + currentSurface.getName() + " и попасть в " + ShouldBeOvercomed.getName());
        ShouldBeOvercomed.setStatusOfOpenness(true);
        System.out.println("С помощью ледоруба получен доступ к " + ShouldBeOvercomed.getName());

    }

    ;


}
