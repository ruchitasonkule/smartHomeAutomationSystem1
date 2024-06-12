package smartHomeAutomationSystem;

public class SmartLight extends AbstractSmartDevice implements ISmartLight {
    private int brightness;
    private String color;

    public SmartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.brightness = 50;
        this.color = "white";
    }

    @Override
    public void turnOn() {
        System.out.println("SmartLight turned on ");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLight turned off");
    }

    @Override
    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println("SmartLight brightness set to " + level);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("SmartLight color set to " + color);
    }
}




