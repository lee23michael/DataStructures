package src;
import java.util.Scanner;

public class BreakOutOfTheLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if( i > m)
            {
                break;
            }
            System.out.println(i);

        }
    }
}
