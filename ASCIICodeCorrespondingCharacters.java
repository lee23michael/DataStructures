package src;
import java.util.*;
public class ASCIICodeCorrespondingCharacters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a < 0 || a > 127)
        {
            System.out.println("error");
            return;
        }

        System.out.println((char)a);


    }
}
