package src;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperation
{
    public static void main(String[] args)
    {
        // ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // Retrieving
        System.out.println(numbers.get(0));

        // Indexed for loop iteration
        System.out.println("\nIteration 1: ");
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }


        System.out.println("\nIteration 2: ");
        for (Integer value : numbers)
        {
            System.out.println(value);
        }

        // Removing

        // Remove late item in list
        numbers.remove(numbers.size() -1 );
        // Remove other items from list (Slow)
        numbers.remove(0);

        // List interface
        List<String> values = new ArrayList<String>();
    }
}