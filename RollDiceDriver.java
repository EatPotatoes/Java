
public class RollDiceDriver {

	public static void main(String[] args) 
	{
		Dice d1, d2;
		
		d1 = new Dice(); //calls the constructor
		d2 = new Dice(); //keyword is "new" for constructor
		
		d1.roll();
		d2.roll();
		
		for (int i = 0; i < 10; i++)
		{
			d1.roll();
			d2.roll();
			System.out.println("Dice 1: " + d1 + " | Dice 2: " + d2);
		}
		
	}
	
}
