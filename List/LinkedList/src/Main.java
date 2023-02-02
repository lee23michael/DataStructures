import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Compare ArrayList and LinkedList

        // Adding or removing item from the end of the list
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Adding or removing item not at the end of the list
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList" , linkedList);
    }

    private static void doTimings(String type, List<Integer> list)
    {
        // Increment the list
        for(int i = 0; i < 1E5; i++)
        {
            list.add(i);
        }

        // Getting how long it takes to add items in a list
        long start = System.currentTimeMillis();

        // Adding items at the end of a list
    /*    for(int i=0; i<1E5; i++)
        {
            list.add(i);
        }
    */
        // Adding items elsewhere of a list
        for(int i=0; i<1E5; i++)
        {
            list.add(0,i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Adding items at the end takes: " + (end - start) + "ms for "+ type);





    }
}