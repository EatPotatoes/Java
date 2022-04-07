
public class SieveDriver 
{

	public static void main(String[] args) 
	{
		SieveArray test1 = new SieveArray(100);
		System.out.println("=============Prime Sieve with Array (length 100)=============y");
		System.out.println(test1);
		
		SieveArrayList test2 = new SieveArrayList(100);
		System.out.println("=============Prime Sieve with ArrayList (length 100)=============");
		System.out.println(test2);
		
		System.out.println("The array algorithm is faster than the ArrayList algorithm");
	}

}
