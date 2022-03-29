
public class Dice 
{
	//instance data
	
	private int faceValue;
	private final int MAX = 6; //maximum number of sides on dice
	
	//constructors (all instance data must be initialized)
	
	public Dice()
	{
		setFaceValue(1);
	}

	
	//getters and setters (accessors and mutators)
	
	public int getFaceValue() 
	{
		return faceValue;
	}

	public void setFaceValue(int fv) 
	{
		this.faceValue = fv;
	}
	
	//any other methods
	
	public void roll()
	{
		faceValue = (int) (Math.random() * MAX + 1);
	}
	
	//toString
	
	public String toString()
	{
		String result = "";
		result = Integer.toString(faceValue);
		
		return result;
	}
}
