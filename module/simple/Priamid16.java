// *     *
//  *   *
//   * *
//    *
//   * *
//  *   * 
// *     *
public class Priamid16 
{
   public static void main(String[] args) 
   {
       for(int i=1; i<=9; i++)
       {
            for(int j=1; j<=9; j++)
            {
                if(i == j || (i+j) == (9+1))
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
       }
   }
}
