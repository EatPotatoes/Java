
public class CoinRaceDriver 
{
	public static void main(String[] args) 
	{
		//initialize coins and variables
		Coin c1, c2;
		c1 = new Coin();
		c2 = new Coin();
		int count1 = 0;
		int count2 = 0;
		int winner = 0;
		int totalCount = 0;
		
		//set up comparison variables
		c1.flip();
		c2.flip();
		boolean c1Prev = c1.isHeads();
		boolean c2Prev = c2.isHeads(); 
		boolean result1;
		boolean result2;
		
		//start flipping coins
		while (count1 < 10 && count2 < 10)
		{			
			//flip coins
			c1.flip();
			c2.flip();
			result1 = c1.isHeads();
			result2 = c2.isHeads();
			totalCount++;
			
			//check to see if result is same as last time
			if (c1Prev == result1)
			{
				count1++;
			}
			else
			{
				count1 = 0;
			}
			if (c2Prev == result2)
			{
				count2++;
			}
			else
			{
				count2 = 0;
			}
			//set result to most recent flip
			c1Prev = c1.isHeads();
			c2Prev = c2.isHeads();
		}
		//check to see which coin wins and print it
		if (count1 >= 10)
		{
			winner = 1;
		}
		if (count2 >= 10)
		{
			winner = 2;
		}
		System.out.println("Coin " + winner + " wins at " + totalCount + " flips!");
		
	}

}
