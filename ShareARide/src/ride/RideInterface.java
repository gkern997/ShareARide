package ride;

import java.util.ArrayList;

public interface RideInterface
{
	Ride createRide(String driver, String start, String end, String date, String time, String rules, int capacity, double rate, Car c);
	Ride getRide(int rideID);
	ArrayList<Ride> getRides();
	void startRide(int rideID);
	void finishRide(int rideID);
	void addPassenger(int rideID);
}
