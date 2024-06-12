package smartHomeAutomationSystem;

public abstract class AbstractSmartDevice 
{
	private String deviceId;
    private String deviceName;

    public AbstractSmartDevice(String deviceId, String deviceName)
    {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    public String getDeviceId() 
    {
        return deviceId;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }

    public abstract void turnOn();

    public abstract void turnOff();
}
 interface ISmartLight {
    void turnOn();

    void turnOff();

    void setBrightness(int level);

    void setColor(String color);
}
 interface ISmartCamera {
	    void turnOn();

	    void turnOff();

	    void takePicture();
	    
	    void startrecordingVideo();
	    void stoprecordingVideo();
	}
 interface ISamartThermostat
 {
	 void turnOn();
	 void turnOff();
	 void setTemperature();
	 
	 
 }
 
