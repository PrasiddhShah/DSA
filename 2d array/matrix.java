
public class matrix {
    
    public static void spiral (int arr[][])
    {
        int startcol = 0;
        int startrow = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;

        while(startrow <= endrow && startcol <= endcol)
        {
            for(int j = startcol; j <= endcol; j++)
            {
                System.out.println(arr[startrow][j]+ " ");
            }
            for(int i = startrow+1; i <=endrow; i++)
            {
                System.out.println(arr[i][endcol]);
            }
            for(int j = endcol - 1; j >= startcol; j--)
            {
                if(startcol == endcol)
                {
                    return;
                }
                System.out.println(arr[endrow][j]);
            }
            for(int i = endrow -1; i >= endrow+1 ; i--)
            {
                System.out.println(arr[i][startcol]);
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }
}
