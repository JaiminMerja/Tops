package module.oops;
public class SortBubble 
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
        int a[] ={23,133,431,5434,123,1,6547,43,2};
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                }
            }
        }
        printArray(a);
    }
}
