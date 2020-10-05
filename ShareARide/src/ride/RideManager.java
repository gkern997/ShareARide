package ride;

import java.util.ArrayList;

public class RideManager implements RideInterface
{
	private static ArrayList<Ride> rides = new ArrayList<Ride>();
	
	@Override
	public Ride createRide(String driver, String start, String end, String date, String time, String rules, int capacity, double rate, Car c)
	{
		Ride r = new Ride(driver, start, end, date, time, rules, capacity, rate, c);
		rides.add(r);
		return(r);
	}

	@Override
	public Ride getRide(int rideID)
	{
		return (findRide(rideID));
	}

	@Override
	public ArrayList<Ride> getRides()
	{
		return (rides);
	}

	@Override
	public void startRide(int rideID)
	{
		Ride r = findRide(rideID);
		r.start();
	}

	@Override
	public void finishRide(int rideID)
	{
		Ride r = findRide(rideID);
		r.finish();
	}
	
	@Override
	public void addPassenger(int rideID)
	{
		Ride r = findRide(rideID);
		r.addOccupant();
	}
	
	private Ride findRide(int rideID)
	{
		for(Ride r : rides)
		{
			if(r.matchesID(rideID))
			{
				return(r);
			}
		}
		
		return new NullRide();
	}
}
