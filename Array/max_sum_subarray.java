public class max_sum_subarray {

    public static void max_sub(int [] arr)
    {
        int max_sub_sum=Integer.MIN_VALUE ;
        for(int start = 0; start<arr.length;start++)
        {
            for (int end = start; end < arr.length;end++)
            {
                int sum_sub_arr = 0;
                for(int k = start;k <= end;k++)
                {
                    sum_sub_arr += arr[k];    
                    if(max_sub_sum < sum_sub_arr)
                    {
                        max_sub_sum = sum_sub_arr;
                    }
                }
            }
        }
        System.out.println(max_sub_sum);
    }
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6,7,8,9};
            max_sub(arr);
        }

}
