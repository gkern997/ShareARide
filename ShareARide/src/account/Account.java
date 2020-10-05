package account;

import java.util.ArrayList;
import rating.Rating;
import system.Message;
import system.IDGenerator;

public abstract class Account
{
	protected String UN, PH;
	protected String PW;
	protected int accountID = 0;
	protected boolean isValid = false;
	protected ArrayList<Rating> ratings;
	protected ArrayList<Message> messages;
	
	public Account()
	{
		UN = null;
		PW = null;
		PH = null;
		ratings = null;
		messages = null;
	}
	
	public Account(String UN, String PW, String PH)
	{
		this.UN = UN;
		this.PW = PW;
		this.PH = PH;
		accountID = IDGenerator.getID();
		isValid = true;
		ratings = new ArrayList<Rating>();
		messages = new ArrayList<Message>();
	}
	
	public boolean matchesID(int accountID)
	{return (this.accountID == accountID);}
	
	public ArrayList<Rating> getRatings()
	{
		return (ratings);
	}
	
	public ArrayList<Message> getMessages()
	{
		return (messages);
	}
	
	public String getUN()
	{return UN;}
	
	public String getPH()
	{return PH;}
	
	public boolean isValid()
	{return isValid;}
}
