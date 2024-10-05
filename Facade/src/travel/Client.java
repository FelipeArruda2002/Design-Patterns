package travel;

public class Client {
	
	public static void main(String[] args) {
		TravelFacade travelFacade = new TravelFacade();
		travelFacade.buyTravelPackage("New York", "Los Angeles");
	}
}
