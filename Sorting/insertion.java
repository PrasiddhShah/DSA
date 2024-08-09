package Sorting;

public class insertion {

    public static void insertion_sort(int [] arr)
    {
        int temp;
        for(int i = 1; i < arr.length; i++)
        {
            temp = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev]>temp)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
            
        }
        for(int k = 0; k < arr.length; k++)
        {
            System.out.println(arr[k]);
        }
    }

    public static void main(String [] args)
    {
        int arr[] = {2,4,1,5,0};
        insertion_sort(arr);
    }
    
}
