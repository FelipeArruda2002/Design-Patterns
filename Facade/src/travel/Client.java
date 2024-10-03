package travel;

public class Client {
	
	public static void main(String[] args) {
		FlightBooking flightBooking = new FlightBooking();
		HotelBooking hotelBooking = new HotelBooking();
		CarRental carRental = new CarRental();

		// O cliente interage diretamente com cada subsistema
		flightBooking.searchFlights("New York", "Los Angeles");
		flightBooking.bookFlight("AA123");

		hotelBooking.searchHotels("Los Angeles");
		hotelBooking.bookHotel("The Grand Hotel");

		carRental.searchCars("Los Angeles");
		carRental.rentCar("Toyota Corolla");
	}
}
