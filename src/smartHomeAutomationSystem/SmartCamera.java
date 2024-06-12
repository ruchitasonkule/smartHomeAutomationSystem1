package smartHomeAutomationSystem;



public class SmartCamera extends AbstractSmartDevice implements ISmartCamera
{
  

    public SmartCamera(String deviceId, String deviceName) 
    {
        super(deviceId, deviceName);
        
    }
    @Override
    public void takePicture() 
    {
        System.out.println("SmartCamera take a picture");
    }
    /*@Override
    public void recordVideo()
    {
        System.out.println("SmartCamera started recording video");
    }
*/
    
	@Override
	public void startrecordingVideo()
	{
		
		System.out.println("SmartCamera started recording video");
	}

	@Override
	public void stoprecordingVideo()
	{
		System.out.println("SmartCamera stop recording video");
	}

	@Override
    public void turnOn() {
        System.out.println("SmartCamera turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartCamera turned off");
    }

}