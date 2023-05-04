package src;
import java.util.Scanner;
public class CountinueTheLoop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);;
        int n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            if (i%3 == 0)
            {
                continue;
            }
            System.out.println(i);
        }

        // write your code here
        // read data from console

        // output the answer to the console according to the
        // requirements of the question

    }

}
