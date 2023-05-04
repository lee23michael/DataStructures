package src;
import java.util.Scanner;

public class ASCIICodeOfTheCharacter
{
    public static void main(String[] args)
    {

        // write your code here
        Scanner sc = new Scanner(System.in);
        // Get a string from the console input
        char c = sc .next().charAt(0);

        /*  Method 1
        System.out.println((int)c);
         */

        int encode = c;
        /* Method 2
        System.out.println(encode);
         */

       /* Method 3
        System.out.println(0 + encode);
         */

        // Method 4
        System.out.println(1* encode);
    }
}
