package device;

public class TV implements Device {

	private boolean enable = false;
	private int volume = 0;
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return enable;
	}

	@Override
	public void enable() {
		System.out.println("TURNING ON THE TV");
		this.enable = true;
	}

	@Override
	public void disable() {
		System.out.println("TURNING OFF THE TV");
		this.enable = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int percent) {
		this.volume = Math.max(0, Math.min(100, percent));
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

}
