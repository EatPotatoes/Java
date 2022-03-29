import java.util.Scanner;

public class TimeAndReverse 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int hours, minutes, seconds, totalSeconds;
		
		final int HOUR_CONSTANT = 3600;
		final int MINUTE_CONSTANT = 60;
		
		System.out.println("Enter the amount of hours: ");
		hours = scan.nextInt();
		System.out.println("Enter the amount of minutes: ");
		minutes = scan.nextInt();
		System.out.println("Enter the amount of seconds: ");
		seconds = scan.nextInt();
		
		totalSeconds = (hours * HOUR_CONSTANT) + (minutes * MINUTE_CONSTANT) + seconds;
		System.out.println("The total amount of seconds is: " + totalSeconds);
		
		System.out.println("Now reverse the process");
		System.out.println("Enter the amount of seconds: ");
		totalSeconds = scan.nextInt();
		
		seconds = totalSeconds % 60;
		minutes = totalSeconds / MINUTE_CONSTANT;
		hours = totalSeconds / HOUR_CONSTANT;
		minutes = minutes - (hours * MINUTE_CONSTANT);
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	}

}
