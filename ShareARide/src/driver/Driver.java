package driver;

import account.Account;

public class Driver extends Account
{	
	public Driver(String UN, String PW, String PH)
	{super(UN, PW, PH);}
	
	public Driver()
	{super();}
	
	public boolean isNull()
	{return false;}
}
