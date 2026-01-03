//Write a program to find that given number or string is palindrome or not.
import java.util.Scanner;
class Palindrome 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");   
        String str = sc.nextLine().toLowerCase();
        String rev = "";
        int i;
        for (i=str.length()-1; i>=0; i--) 
        {
            rev = rev+str.charAt(i);
        }
        if (str.equals(rev)) 
        {
            System.out.println(str + " is a palindrome.");
        } 
        else 
        {
            System.out.println(str + " is not a palindrome.");
        }    
    }
}
