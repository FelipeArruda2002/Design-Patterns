package types.vehicle;

public class AirTransport extends Transport {

	@Override
	public Vehicle createVehicle() {
		return new Plane();
	}

}
