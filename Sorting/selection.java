package Sorting;

public class selection {

    public static void selection(int[] arr)
    {
        int smallest = Integer.MAX_VALUE;
        int index = -2;
        for(int i = 0; i < arr.length; i++)
        {
            smallest = arr[i];
            for(int j = 0 + i; j < arr.length; j++)
            {
                if( smallest > arr[j] )
                {
                    smallest = arr[j];
                    index = j;
                }
            }
            if(smallest != arr[i])
            {
                arr[index] = arr[i];
                arr[i] = smallest;
            }
        }
        for(int k = 0; k < arr.length; k++)
        {
            System.out.println(arr[k]);
        }
    }
    public static void main(String arg[])
    {
        int arr[] = {2,1,6,5,3,99,100,8};
        selection(arr);
    }
    
}
