package system;

public class Message
{
	private String text;
	
	public Message(String text)
	{this.text = text;}
	
	public boolean isNull()
	{return false;}
	
	public String getText()
	{return text;}
}
