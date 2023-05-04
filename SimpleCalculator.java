package src;

public class SimpleCalculator
{
    public int calculate(int a, char op, int b)
    {
        // write your code here
        switch (op)
        {
            case '+':
                return a+b;

            case '-':
                return a-b;

            case '*':
                return a*b;

            case '/':
                return a/b;

            default: System.out.println("enter a correct input");


        }
        return 0;
    }
}
