package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String boomType;
    private String attachmentsName;

    public Excavator() {
    }

    public Excavator(String boomType, String attachmentsName, String name, String color) {
        this.boomType = boomType;
        this.attachmentsName = attachmentsName;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getBoomType() {
        return boomType;
    }

    public void setBoomType(String boomType) {
        this.boomType = boomType;
    }

    public String getAttachmentsName() {
        return attachmentsName;
    }

    public void setAttachmentsName(String attachmentsName) {
        this.attachmentsName = attachmentsName;
    }
}
