package ride;

import system.IDGenerator;

public class Ride
{
	private String driver, start, end, date, time, rules;
	private int rideID;
	private int capacity = 0;
	private int occupants = 0;
	private double rate;
	private boolean isStarted = false;
	private boolean isFinished = false;
	private Car vehicle;
	
	public Ride(String driver, String start, String end, String date, String time, String rules, int capacity, double rate, Car vehicle)
	{
		this.driver = driver;
		this.start = start;
		this.end = end;
		this.date = date;
		this.time = time;
		this.rules = rules;
		this.capacity = capacity;
		rideID = IDGenerator.getID();
		this.rate = rate;
		this.vehicle = vehicle;
	}
	
	public Ride()
	{
		driver = null;
		start = null;
		end = null;
		date = null;
		time = null;
		rules = null;
		capacity = 0;
		rate = 0;
		vehicle = null;
	}
	
	public boolean isStarted()
	{return isStarted;}
	
	public boolean isFinished()
	{return isFinished;}
	
	public boolean isNull()
	{return false;}
	
	public boolean matchesID(int rideID)
	{return (rideID == this.rideID);}
	
	public void start()
	{
		isStarted = true;
		isFinished = false;
	}
	
	public void finish()
	{
		isFinished = true;
		isStarted = false;
		capacity = 0;
	}
	
	public void addOccupant()
	{occupants++;}
	
	public String getDriver()
	{return driver;}
	
	public String getStart()
	{return start;}
	
	public String getEnd()
	{return end;}
	
	public String getDate()
	{return date;}
	
	public String getTime()
	{return time;}
	
	public String getRules()
	{return rules;}
	
	public int getCapacity()
	{return capacity;}
	
	public double getRate()
	{return rate;}
	
	public Car getVehicle()
	{return vehicle;}
	
	public int getRideID()
	{return rideID;}
	
	public int getOccupants()
	{return occupants;}
}
