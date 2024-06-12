package smartHomeAutomationSystem;



public class SmartHomeController {
    private AbstractSmartDevice[] devices;
    private int deviceCount;

    public SmartHomeController(int maxDevices) {
        devices = new AbstractSmartDevice[maxDevices];
        deviceCount = 0;
    }

    public void addDevice(AbstractSmartDevice device) {
        if (deviceCount < devices.length) {
            devices[deviceCount] = device;
            deviceCount++;
        } else {
            System.out.println("Maximum device limit reached.");
        }
    }

    public void turnAllDevicesOn() 
    {
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOn();
        }
    }

    public void turnAllDevicesOff() {
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOff();
        }
    }
}
