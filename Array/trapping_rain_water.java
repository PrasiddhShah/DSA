public class trapping_rain_water {

    public static void rain_vol(int[] arr)
    {
        int left_max[]  = new int [arr.length];
        int right_max[] = new int[arr.length];
        int vol[] = new int[arr.length];
        left_max[0] = arr[0];
        right_max[right_max.length - 1] = arr[arr.length -1];
        for(int i = 1; i < left_max.length;i++)
        {
            if(arr[i]> left_max[i-1])
            {
                left_max[i] = arr[i];
            }
            else{
                left_max[i] = left_max[i-1];
            }
        }

        for(int j = (right_max.length - 2); j >= 0; j--)
        {
            if(arr[j] > right_max[j+1])
            {
                right_max[j] = arr[j];

            }
            else{
                right_max[j] = right_max[j+1];
            }
        }

        for(int k = 0; k < arr.length;k++)
        {
            vol[k] = Math.min(left_max[k], right_max[k]) - arr[k];
            if(vol[k]< 0 )
            {
                vol[k] = 0;
            }
            System.out.println(vol[k]);
        }
        

    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        rain_vol(arr);
    }
    
}
