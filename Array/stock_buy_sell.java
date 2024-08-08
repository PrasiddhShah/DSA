public class stock_buy_sell {

    public static void stocks(int[]arr)
    {
        int buy_price = arr[0];
        int sell_price = 0;
        int profit = 0;
        int max_profit = 0;
        for(int i = 1; i < arr.length;i++)
        {
            sell_price = arr[i];
            if(buy_price < sell_price)
            {
                profit = sell_price - buy_price;
            }
            if(buy_price >arr[i]){
                buy_price = arr[i];
            }
            max_profit=Math.max(max_profit,profit);

        }
        System.out.println(max_profit);
    }

    public static void main(String args[])
    {
            int arr[] = {7,1,5,3,6,4};
            stocks(arr);
    }
    
}
