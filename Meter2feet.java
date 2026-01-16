//Write a program that reads a number in meters, converts it to feet, and displays the result.
import java.util.Scanner;
class Meter2feet
{
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter meters for height calculation: ");
        float meter = sc.nextFloat();
		float feet = meter * 3.281f;
		System.out.println("Feet Result: " + feet);
		System.out.println("Name: Krisha Kalal");
		System.out.println("Enrolment no: 2501030430001");
	}
}