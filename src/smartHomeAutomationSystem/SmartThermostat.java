package smartHomeAutomationSystem;

public class SmartThermostat extends AbstractSmartDevice implements ISamartThermostat{
    private int temperature;

    public SmartThermostat(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.temperature = 22;
    }

   
    @Override
    public void turnOn() {
        System.out.println("SmartThermostat turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartThermostat turned off");
    }

	@Override
	public void setTemperature() {
		 System.out.println("SmartThermostat temperature set to " + temperature);
	}
}