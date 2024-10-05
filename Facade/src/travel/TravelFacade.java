package travel;

public class TravelFacade {

	private FlightBooking flightBooking;
	private HotelBooking hotelBooking;
	private CarRental carRental;

	public TravelFacade() {
		this.flightBooking = new FlightBooking();
		this.hotelBooking = new HotelBooking();
		this.carRental = new CarRental();
	}

	public void buyTravelPackage(String from, String to) {

		flightBooking.searchFlights(from, to);
		flightBooking.bookFlight("AA123");

		hotelBooking.searchHotels(to);
		hotelBooking.bookHotel("The Grand Hotel");

		carRental.searchCars(to);
		carRental.rentCar("Toyota Corolla");

	}

}
