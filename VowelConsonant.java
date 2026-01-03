//Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.
import java.util.Scanner;
class VowelConsonant 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = sc.nextLine();
        char ch = letter.charAt(0);
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) 
        {
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
            {
                System.out.println("Given letter: " + ch + " is a Vowel.");
            } 
            else 
            {
                System.out.println("Given letter: " + ch + " is a Consonant.");
            }
        } 
        else 
        {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
