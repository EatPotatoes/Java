
import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance 
{

	public static void main(String[] args) 
	{

		//initiate things
		int pt1x, pt1y, pt2x, pt2y;
		double distance, xchange, ychange;
		
		Scanner scan = new Scanner (System.in);
		DecimalFormat fmt = new DecimalFormat ("0.###");
		
		//take input (assuming coordinates are integers)
		System.out.println("Enter the first point's x-coordinate: ");
		pt1x = scan.nextInt();
		System.out.println("Enter the first point's y-coordinate: ");
		pt1y = scan.nextInt();
		System.out.println("Enter the second point's x-coordinate: ");
		pt2x = scan.nextInt();
		System.out.println("Enter the second point's y-coordinate: ");
		pt2y = scan.nextInt();
		
		//calculate
		xchange = Math.pow((pt2x - pt1x), 2);
		ychange = Math.pow((pt2y - pt1y), 2);
		distance = Math.sqrt(xchange + ychange);
		
		//output
		System.out.println("The distance between the two points is: " + fmt.format(distance));
		
	}

}
