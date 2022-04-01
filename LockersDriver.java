
public class LockersDriver 
{
	public static void main(String[] args) 
	{
		Lockers simulation = new Lockers();
		System.out.println(simulation);
	}

}

/*
1. What do you notice about the lockers that remain open?  
	The lockers that remain open are perfect squares.
2. Can you explain your results?
	The perfect squares are open because the way the process is.
	Because every loop has a new "pattern", the patterns eventually "add up" to only perfect squares open.
*/