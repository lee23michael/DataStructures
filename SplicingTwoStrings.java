package src;
import java.util.Scanner;

public class SplicingTwoStrings
{
    public static void main(String[] args)
    {
        // write your code here
        // read data from console
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // output the answer to the console according to the
        // requirements of the question
        System.out.println( s1 + s2 );
        System.out.println( s1.concat(s2) );

    }
}
