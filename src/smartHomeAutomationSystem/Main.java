package smartHomeAutomationSystem;

public class Main {
	    public static void main(String[] args)
	    {
	        SmartHomeController controller = new SmartHomeController(5);

	        SmartLight light = new SmartLight("L1","Light");
	        SmartThermostat thermostat = new SmartThermostat("T1", " Room Thermostat");
	        SmartCamera camera = new SmartCamera("C2", "Living Room Camera");

	        controller.addDevice(light);
	        controller.addDevice(thermostat);
	        controller.addDevice(camera);
	        System.out.println();

	        controller.turnAllDevicesOn();
	        System.out.println();

	        light.setBrightness(90);
	        light.setColor("blue");
	        System.out.println();

	        thermostat.setTemperature();
	        System.out.println();

	        camera.takePicture();
	        camera.startrecordingVideo();
	       camera.stoprecordingVideo();
	        System.out.println();

	        controller.turnAllDevicesOff();
	}
	
	

}
