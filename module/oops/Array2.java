package module.oops;
// 1 2 3
// 1 2 3
// 1 2 3
public class Array2 
{
    public static void main(String[] args) 
    {
        int[][] a = new int[3][3];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++) 
            {
            a[i][j]=j+1;
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
