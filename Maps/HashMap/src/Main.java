import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        /*
        * Maps store data as a pair (key and value)
        * Specify the type of key and value when create a map
        * HashMap doesn't sorted in order
        */
        HashMap <Integer, String> map = new HashMap<Integer, String>();

        // Insert
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");

        map.put(5,"FIVE"); // Same key will overwrite previous key's value

        // Retrieve
        String text = map.get(5);

        System.out.println(text);

        // Iterating a map
        for(Map.Entry<Integer, String> entry : map.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ":" + value);
        }
    }
}