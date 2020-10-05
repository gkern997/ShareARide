package rating;

public class Rating
{
	private String text;
	private double rating;
	
	public Rating(String text, double rating)
	{
		this.text = text;
		this.rating = rating;
	}
	
	public Rating()
	{
		text = null;
		rating = 0;
	}
	
	public boolean isNull()
	{return false;}
	
	public String getText()
	{return text;}
	
	public double getRating()
	{return rating;}
}
