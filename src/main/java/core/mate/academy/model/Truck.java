package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int diskRadius;
    private String lengthType;
    private String bodyType;

    public Truck() {
    }

    public Truck(int diskRadius, String lengthType, String bodyType, String name, String color) {
        this.diskRadius = diskRadius;
        this.lengthType = lengthType;
        this.bodyType = bodyType;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getDiskRadius() {
        return diskRadius;
    }

    public void setDiskRadius(int diskRadius) {
        this.diskRadius = diskRadius;
    }

    public String getLengthType() {
        return lengthType;
    }

    public void setLengthType(String lengthType) {
        this.lengthType = lengthType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
