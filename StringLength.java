//Write a program to find length of string and print second half of the string.
import java.util.Scanner;
class StringLength 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("The length of the string is: " + length);
        String secondHalf = str.substring(length / 2);
        System.out.println("The second half of the string is: " + secondHalf);
    }
}
