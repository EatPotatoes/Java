/**
 * Implements the Sieve of Eratosthenes using arrays
 * @author 23azhang
 *
 */
public class SieveArray 
{
	private boolean[] primes;
	private int n;
	private int counter;
	
	/**
	 * Runs the sieve using arrays, tests to see if each number is prime or not.
	 * @param number is the last number from 2 to that number to be run through the sieve.
	 */
	public SieveArray(int number)
	{
		counter = 0;
		n = number;
		primes = new boolean[n + 1];
		for (int x = 0; x <= n; x++)
		{
			primes[x] = true;
		}
		
		for (int p = 2;(p * p) < n; p++)
		{
			if(primes[p] == true)
			{
				for(int i = p + p; i <= n; i += p)
				{
					primes[i] = false;
					counter += 1;
				}
			}
			counter += 1;
		}
	}
	
	public String toString()
	{
		String result = "";
		for(int x = 2; x < primes.length; x++)
		{
			if(primes[x] == true)
				result += x + "\n";
		}
		
		return result + "\nCounter (1 count per for loop iteration): " + counter;
	}
}
