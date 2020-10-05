package rating;

public class NullRating extends Rating
{
	public NullRating()
	{super();}
	
	@Override
	public boolean isNull()
	{return true;}
}
