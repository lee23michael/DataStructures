package src;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice
{
    public static void main(String[] args)
    {
        /*
         * Set doesn't maintain duplicate value
         */

        // HashSet is unordered
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("A");
        hashSet.add("V");
        hashSet.add("N");
        hashSet.add("D");
        hashSet.add("J");
        hashSet.add("P");
        hashSet.add("M");

        // Adding duplicate items does nothing
        hashSet.add("P");

        System.out.println("HashSet" + "\n" + hashSet + "\n");

        //LinkedHashSet keep order as items added in
        Set<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("A");
        linkedHashSet.add("V");
        linkedHashSet.add("N");
        linkedHashSet.add("D");
        linkedHashSet.add("J");
        linkedHashSet.add("P");
        linkedHashSet.add("M");

        System.out.println("LinkedHashSet" + "\n" + linkedHashSet + "\n");

        //TreeSet sorts in natural order
        Set<String> treeSet = new TreeSet<String>();

        treeSet.add("A");
        treeSet.add("V");
        treeSet.add("N");
        treeSet.add("D");
        treeSet.add("J");
        treeSet.add("P");
        treeSet.add("M");
        treeSet.add("Z");

        System.out.println("TreedHashSet" + "\n" + treeSet + "\n");


        // Iteration //
        for(String element : hashSet)
        {
            System.out.println(element);
        }

        // Checking if an item in the set //
        if (hashSet.contains("B"))
        {
            System.out.println("This set has B");
        }

        if (hashSet.contains("A"))
        {
            System.out.println("This set has A");
        }

        // Intersection //

        // Make a copy of one of the intersect set
        Set<String> intersection = new HashSet<String>(hashSet);
        intersection.retainAll(treeSet);
        System.out.println(intersection + " in both sets");

        // Difference //
        Set<String> difference = new HashSet<String>(treeSet);
        difference.removeAll(hashSet);
        System.out.println(difference );
    }
}