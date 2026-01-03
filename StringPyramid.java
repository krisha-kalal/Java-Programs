//Write an interactive program to print a string entered in a pyramid form.
import java.util.Scanner;
class StringPyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int len = s.length();
        int i, j;
        for(i=0; i<len; i++) 
        {
            for(j=0; j<=i; j++) 
            {
                System.out.println(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
