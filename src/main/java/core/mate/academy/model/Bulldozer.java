package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean isHaveRipper;
    private String bladeType;

    public Bulldozer() {
    }

    public Bulldozer(boolean isHaveRipper, String bladeType, String name, String color) {
        this.isHaveRipper = isHaveRipper;
        this.bladeType = bladeType;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public boolean isHaveRipper() {
        return isHaveRipper;
    }

    public void setHaveRipper(boolean haveRipper) {
        isHaveRipper = haveRipper;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }
}
