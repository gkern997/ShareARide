package system;

import java.util.concurrent.atomic.AtomicInteger;

public class IDGenerator
{
	static AtomicInteger ID = new AtomicInteger();
	
	public static int getID()
	{return ID.incrementAndGet();}
}
