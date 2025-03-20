package module.oops;
import java.util.Scanner;

public class PalidromNo 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        int copy=n, sum=0;
        while(n>0)
        {
            int t = n % 10;
            sum = (sum * 10) + t;
            n = n/10;   
        }
        if(sum == copy)
        {
            System.out.println("Number is Palidrom:"+sum);
        }
        else
        {
            System.out.println("Number is not Palidrom:"+sum);
        }
    }
}
