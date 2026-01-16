//Write a program that calculates percentage marks of the student if marks of 6 subjects are given.
import java.util.Scanner;
class PercentageMarks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your maths subject marks: ");
        int maths = sc.nextInt();
        System.out.print("Enter your english subject marks: ");
        int english = sc.nextInt();
        System.out.print("Enter your ss subject marks: ");
        int ss = sc.nextInt();
        System.out.print("Enter your science subject marks: ");
        int science = sc.nextInt();
        System.out.print("Enter your gujarati subject marks: ");
        int gujarati = sc.nextInt();
        System.out.print("Enter your computer subject marks: ");
        int computer = sc.nextInt();
        float percentage = ((maths + english + ss + science + gujarati + computer) / 600.0f) * 100;
        System.out.println("Your Percentage is: " + percentage);
        System.out.println("Name: Krisha Kalal");
		System.out.println("Enrolment no: 2501030430001");
    }
}
