package passenger;

import java.util.ArrayList;
import driver.Driver;
import ride.Ride;
import rating.Rating;
import system.Message;

public interface PassengerInterface
{
	ArrayList<Ride> findRide(String start, String end);
	void sendMessage(int accountID, Message m);
	void rateDriver(int accountID, Rating r);
	void confirmRide(int accountID, Ride r);
	Passenger getPassenger(int accountID);
	ArrayList<Passenger> getPassengers();
	ArrayList<Rating> viewRatings(int accountID);
	ArrayList<Rating> viewDriverRatings(int accountID);
	ArrayList<Message> viewMessages(int accountID);
}
