package module.oops;
public class SortSelection 
{
    public static void printArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int a[] ={9,8,7,6,5,4,3,2,1};
        for(int i=0; i<a.length-1; i++)
        {
            int smallest = i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[smallest] > a[j])
                {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        printArray(a);
    }
}
