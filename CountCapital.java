//Write a program to count the number of words that start with capital letters.
import java.util.Scanner;
class CountCapital 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int count=0, i;
        for(i=0 ; i<s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (ch>='A' && ch<='Z') 
            {
                count++;
            }
        }
        System.out.println("Name: Krisha Kalal");
        System.out.println("Enrolment no: 2501030430001");
    }
}
