package types.vehicle;

public class GroundTransportation extends Transport {

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

}
