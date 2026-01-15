//Write a program that prompts the user to enter three integers and display the integers in decreasing order.
import java.util.Scanner;
class DecreasingOrder 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter third integer: ");
        int c = sc.nextInt();
        if(a>=b && a>=c) 
        {
            if(b>=c) 
            {
                System.out.println("Decreasing order: " + a + " " + b + " " + c);
            } 
            else 
            {
                System.out.println("Decreasing order: " + a + " " + c + " " + b);
            }
        } 
        else if(b>=a && b>=c) 
        {
            if(a>=c) 
            {
                System.out.println("Decreasing order: " + b + " " + a + " " + c);
            } 
            else 
            {
                System.out.println("Decreasing order: " + b + " " + c + " " + a);
            }
        } 
        else 
        {
            if(a>=b) 
            {
                System.out.println("Decreasing order: " + c + " " + a + " " + b);
            } 
            else 
            {
                System.out.println("Decreasing order: " + c + " " + b + " " + a);
            }
        }
        System.out.println("Name: Krisha Kalal");
        System.out.println("Enrolment no: 2501030430001");
    }
}
