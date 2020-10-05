package ride;

public class Car
{
	private String make, model, color, plate, state;
	
	public Car(String make, String model, String color, String plate, String state)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.plate = plate;
		this.state = state;
	}
	
	public boolean isNull()
	{return false;}
	
	public String getMake()
	{return make;}
	
	public String getModel()
	{return model;}
	
	public String getColor()
	{return color;}
	
	public String getPlate()
	{return plate;}
	
	public String getState()
	{return state;}
}
