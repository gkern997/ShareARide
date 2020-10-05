package passenger;

public class NullPassenger extends Passenger
{
	public NullPassenger()
	{super();}
	
	@Override
	public boolean isNull()
	{return true;}
}
