package module.oops;
// public class Array4
// {
//     public static void main(String[] args) 
//     {
//         int a[] = {1,2,3,4,5};
//         int max = a[0];
//         for(int i=0; i<a.length; i++)
//         {
//             while (a[i] > max)
//             {
//                 max = a[i];
//             }
//             System.out.println(max);
//         }
//     }
// }

// 2nd Largest Number

public class Array4
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 35, 1, 10, 34, 12};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > first)
            {
               second = first;
               first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first)
            {
               second = arr[i] ;
            }
        }
        System.out.println("Second Largest Number:"+second);
    }
}
