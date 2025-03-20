package module.oops;
import java.util.Scanner;

public class ArmstrongNo
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
            sum = sum + (t*t*t);
            n = n/10;
        }
        if(sum == copy)
        {
            System.out.println("Number is Armstrong:"+sum);
        }
        else
        {
            System.out.println("Number is not Armstrong:"+sum);
        }
    }
}


// 1 to 1000
// public class ArmstrongNo 
// {
//     public static void main(String[] args) 
//     {
//         for (int i = 1; i <= 1000; i++) 
//         {
//             int s = 0, n = i, temp = i;

//             while (temp > 0) 
//             {
//                 int t = temp % 10;
//                 s = s + (t * t * t);
//                 temp = temp / 10;
//             }

//             if (s == n) 
//             {
//                 System.out.println("Number is Armstrong: " + s);
//             }
//         }
//     }
// }
