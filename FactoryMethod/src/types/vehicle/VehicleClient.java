package types.vehicle;

public class VehicleClient {

	public static void main(String[] args) {
		Transport tranport;
		
		tranport = new GroundTransportation();
		tranport.startTransport();
		
		tranport = new MaritimeTransport();
		tranport.startTransport();
		
		tranport = new AirTransport();
		tranport.startTransport();
		
	}

}
