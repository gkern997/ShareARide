package passenger;

import account.Account;

public class Passenger extends Account
{
	private boolean onRide = false;
	
	public Passenger(String UN, String PW, String PH)
	{super(UN, PW, PH);}
	
	public Passenger()
	{super();}
	
	public boolean onRide()
	{return onRide;}
	
	public void boardRide()
	{onRide = true;}
	
	public boolean isNull()
	{return false;}
}
