package module.oops;
// String Reverse
import java.util.Scanner;

public class String6
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a =s.nextLine();
        String reverse="";
        for(int i=a.length()-1; i>=0; i--)
        {
            reverse += a.charAt(i);
        }
        System.out.println("Reverse String: "+reverse);
    }
}