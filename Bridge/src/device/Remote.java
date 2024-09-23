package device;

/**
 * Abstração
 */
public class Remote {

	protected Device device;

	public Remote(Device device) {
		this.device = device;
	}

	public void togglePower() {
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	public void volumeDown() {
		int currentVolume = device.getVolume();
		device.setVolume(currentVolume + 10);
	}

	public void volumeUp() {
		int currentVolume = device.getVolume();
		device.setVolume(currentVolume - 10);
	}

	public void channelDown() {
		int old = device.getChannel();
		device.setChannel(old - 1);
	}

	public void channelUp() {
		int old = device.getChannel();
		device.setChannel(old + 1);
	}

}
