package types.vehicle;

public class MaritimeTransport extends Transport {

	@Override
	public Vehicle createVehicle() {
		return new Boat();
	}

}
