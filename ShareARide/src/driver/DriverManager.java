package driver;

import java.util.ArrayList;
import passenger.Passenger;
import passenger.PassengerInterface;
import passenger.PassengerManager;
import rating.Rating;
import ride.Ride;
import ride.RideInterface;
import ride.RideManager;
import system.Message;

public class DriverManager implements DriverInterface
{
	private static ArrayList<Driver> drivers = new ArrayList<Driver>();
	private static RideInterface ri = new RideManager();
	private static PassengerInterface pi = new PassengerManager();
	
	@Override
	public void postRide(Ride r)
	{ri.createRide(r.getDriver(), r.getStart(), r.getEnd(), r.getDate(), r.getTime(), r.getRules(), r.getCapacity(), r.getRate(), r.getVehicle());}
	
	@Override
	public void sendMessage(int accountID, Message m)
	{
		Passenger p = pi.getPassenger(accountID);
		p.getMessages().add(m);
	}

	@Override
	public void ratePassenger(int accountID, Rating r)
	{
		Passenger p = pi.getPassenger(accountID);
		p.getRatings().add(r);
	}

	@Override
	public Driver getDriver(int accountID)
	{
		Driver d = findDriver(accountID); // perform null checks, if findDriver returns null, return a NullDriver object
		return (d);
	}

	@Override
	public ArrayList<Driver> getDrivers()
	{return (drivers);}

	@Override
	public ArrayList<Rating> viewRatings(int accountID)
	{
		Driver d = findDriver(accountID);
		return d.getRatings();
	}
	
	@Override
	public ArrayList<Rating> viewPassengerRatings(int accountID)
	{
		Passenger p = pi.getPassenger(accountID);
		return p.getRatings();
	}
	
	@Override
	public ArrayList<Message> viewMessages(int accountID)
	{
		Driver d = findDriver(accountID);
		return d.getMessages();
	}
	
	private Driver findDriver(int accountID)
	{
		for(Driver d : drivers)
		{
			if(d.matchesID(accountID))
			{
				return(d);
			}
		}
		
		return new NullDriver();
	}
}
