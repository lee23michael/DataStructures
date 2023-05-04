package src;

public class MaxOfArray
{
    /**
     * @param a: an array of float numbers
     * @return: a float number
     */
    public float maxOfArray(float[] a)
    {
        // write your code here
        float temp = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] >= temp)
            {
                temp = a[i];
            }
            else
            {
                temp = temp;
            }
        }

        return temp;

    }
}
