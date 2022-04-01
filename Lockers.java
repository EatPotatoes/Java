/**
 * Solves the locker problem on 100 lockers
 * @author 23azhang
 *
 */
public class Lockers
{
	private boolean[] lockers;
	private final int MAX_LOCKERS = 100;
	
	/**
	 * initializes the instance data and runs the locker simulation
	 */
	public Lockers()
	{
		
		lockers = new boolean[MAX_LOCKERS];
		for(int a = 0; a < MAX_LOCKERS; a++)
		{
			lockers[a] = false;
		}
		
		for(int n = 0; n < 100; n++) 
		{
			for (int x = 0; x < 100; x++)
			{
				if ((x + 1) % (n + 1) == 0)
				{
					if (lockers[x] == true)
					{
						lockers[x] = false;
					}
					else
					{
						lockers[x] = true;
					}
				}
			}
		}
	}
	
	public String toString()
	{
		String result = "";
		for(int x = 0; x < MAX_LOCKERS; x++)
		{
			if(lockers[x] == true)
			{
				result = result + (x + 1) + "\n";
			}
		}
		return "Open locker numbers: " + "\n" + result;
	}
}
