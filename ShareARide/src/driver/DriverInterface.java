package driver;

import java.util.ArrayList;
import ride.Ride;
import rating.Rating;
import system.Message;

public interface DriverInterface
{
	void postRide(Ride r);
	void sendMessage(int accountID, Message m);
	void ratePassenger(int accountID, Rating r);
	Driver getDriver(int accountID);
	ArrayList<Driver> getDrivers();
	ArrayList<Rating> viewRatings(int accountID);
	ArrayList<Rating> viewPassengerRatings(int accountID);
	ArrayList<Message> viewMessages(int accountID);
}
