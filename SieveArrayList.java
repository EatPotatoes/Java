import java.util.ArrayList;
/**
 * Implements the Sieve of Eratosthenes using ArrayList
 * @author 23azhang
 *
 */
public class SieveArrayList 
{
	private ArrayList<Integer> nums;
	private int n;
	private int counter;
	
	/**
	 * Runs the sieve using ArrayList, removing non-prime numbers and leaving primes.
	 * @param number is the last number from 2 to that number to be run through the sieve.
	 */
	public SieveArrayList(int number)
	{
		counter = 0;
		n = number;
		nums = new ArrayList<Integer>();
		for (int x = 2; x < n - 1; x++)
		{
			nums.add(x);
		}
		
		for (int p = 2; p * p <= n; p++)
		{
			for(int a = p; a < nums.size(); a++)
			{
				 if (nums.get(a) % p == 0)
				 {
					 nums.remove(a);
				 }
				 counter += 1;
			}
			counter += 1;
		}
	}
	
	public String toString()
	{
		String result = "";
		for(int i = 0; i < nums.size(); i++)
		{
			result = result + nums.get(i) + "\n";
		}
		
		return result + "\nCounter (1 count per for loop iteration): " + counter;
	}
}
