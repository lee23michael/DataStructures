public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {10, 2, 5, -2, 8, 1, 9};

        for (int i = 0; i < nums.length; i++)
        {
            int minIndex = i ;

            for(int j = i + 1; j <  nums.length; j++)
            {
                if ( nums[j] < nums[minIndex])
                {
                    minIndex = j;
                }
            }
             int t = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = t;
        }

        for (int k = 0; k < nums.length; k++)
        {
            System.out.println(nums[k] + " ");
        }
        System.out.println();
    }
    //(n-1) + (n-2) + (n-3) + ......+1 = n * (n-1)/2
}


