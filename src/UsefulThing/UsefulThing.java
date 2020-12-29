package UsefulThing;

public abstract class UsefulThing {

    protected String name;
    protected boolean deviceInUse = false;

    public UsefulThing(String name, boolean deviceInUse) {
        this.name = name;
        this.deviceInUse = deviceInUse;
    }

    public UsefulThing() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeviceInUse() {
        return deviceInUse;
    }

    public void setDeviceInUse(boolean deviceInUse) {
        this.deviceInUse = deviceInUse;
    }
}
