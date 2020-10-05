package passenger;

import java.util.ArrayList;
import driver.*;
import rating.Rating;
import ride.Ride;
import ride.RideInterface;
import ride.RideManager;
import system.Message;

public class PassengerManager implements PassengerInterface
{
	private static ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	private static RideInterface ri = new RideManager();
	private static DriverInterface di = new DriverManager();
	
	@Override
	public ArrayList<Ride> findRide(String start, String end)
	{
		ArrayList<Ride> matches = new ArrayList<Ride>();
		
		for(Ride r : ri.getRides())
		{
			if(r.getStart().equalsIgnoreCase(start) && r.getEnd().equalsIgnoreCase(end))
			{
				matches.add(r);
			}
		}
		
		return (matches);
	}

	@Override
	public void sendMessage(int accountID, Message m)
	{
		Driver d = di.getDriver(accountID);
		d.getMessages().add(m);
	}

	@Override
	public void rateDriver(int accountID, Rating r)
	{
		Driver d = di.getDriver(accountID);
		d.getRatings().add(r);
	}

	@Override
	public void confirmRide(int accountID, Ride r)
	{
		Passenger p = findPassenger(accountID);
		
		if(p != null && r.getOccupants() <= r.getCapacity())
		{
			p.boardRide();
			ri.addPassenger(r.getRideID());
		}
	}

	@Override
	public Passenger getPassenger(int accountID)
	{
		Passenger p = findPassenger(accountID);
		return (p);
	}

	@Override
	public ArrayList<Passenger> getPassengers()
	{return (passengers);}

	@Override
	public ArrayList<Rating> viewRatings(int accountID)
	{
		Passenger p = findPassenger(accountID);
		return p.getRatings();
	}

	@Override
	public ArrayList<Rating> viewDriverRatings(int accountID)
	{
		Driver d = di.getDriver(accountID);
		return d.getRatings();
	}

	@Override
	public ArrayList<Message> viewMessages(int accountID)
	{
		Passenger p = findPassenger(accountID);
		return p.getMessages();
	}
	
	private Passenger findPassenger(int accountID)
	{
		for(Passenger p : passengers)
		{
			if(p.matchesID(accountID))
			{
				return(p);
			}
		}
		
		return new NullPassenger();
	}
}
