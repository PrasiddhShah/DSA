public class kadanes_max_sum_subarray{
    public static void sum_arr(int[] arr){
        int currsum = 0;
        int max_sum = 0;
        for(int i = 1; i < arr.length;i++ )
        {
            currsum = currsum + arr[i];
            if(currsum < 0)
            {
                currsum = 0;
            }

            max_sum = Math.max(currsum,max_sum);
        }

    }
}