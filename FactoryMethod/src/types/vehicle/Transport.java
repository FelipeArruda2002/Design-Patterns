package types.vehicle;

public abstract class Transport {
	
	public abstract Vehicle createVehicle();

	public void startTransport() {
		Vehicle vehicle = createVehicle();
		vehicle.carry();
	}

}
