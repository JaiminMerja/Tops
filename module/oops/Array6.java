package module.oops;
//Sum of all emelent in Array
public class Array6 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5};
        int sum = a[0];
        for(int b : a)
        {
            sum += b;
        }
        System.out.println(sum);
    }
}
