package module.oops;
//Palindrom
import java.util.Scanner; 
public class String9 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = s.nextLine();
        String reverse ="";
        for(int i=a.length()-1; i>=0; i--)
        {
            reverse += a.charAt(i);
        }
        System.out.println("Reverse is:"+reverse);
        if(reverse.equalsIgnoreCase(a))
        {
            System.out.println("Is palindrome...");
        }
        else
        {
            System.out.println("Not a palidrome....");
        }
    }
}
