package src;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person
{
    private int id;
    private String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return id + ": "+name;
    }
}
public class Maps
{
    public static void main (String[] args)
    {
        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "James");
        Person p3 = new Person(2, "Sue");
        Person p4 = new Person(1, "Bob");

        Map<Person,Integer> person = new LinkedHashMap<Person,Integer>();

        person.put(p1,1);
        person.put(p2,2);
        person.put(p3,3);
        person.put(p4,4);

        for(Person key: person.keySet())
        {
            System.out.println(key + ": "+ person.get(key));
        }


        Map<String,Integer> map = new LinkedHashMap<String,Integer>();

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("One",4);

        for(String key: map.keySet())
        {
            System.out.println(key + ": "+ map.get(key));
        }

        Set<String> set = new LinkedHashSet<>();

        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("cat");


        System.out.println(set);

    }
}
