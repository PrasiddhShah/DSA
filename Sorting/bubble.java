package Sorting;

public class bubble {

    public static void bubble_sort(int [] arr)
    {
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = 0; j < arr.length -1- i; j++)
                {
                        if(arr[j] > arr[j+1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                }
            }
            for(int k = 0; k < arr.length; k++)
            {
                System.out.println(arr[k]);
            }
    }

    public static void main(String arg[])
    {
        int arr[] = {2,1,3,10,9,22,11};
        bubble_sort(arr);
    }
    
}
