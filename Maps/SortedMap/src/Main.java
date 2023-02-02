import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map)
    {
        map.put(9,"nine");
        map.put(4,"four");
        map.put(23,"twenty three");
        map.put(11,"eleven");
        map.put(0,"zero");
        map.put(19,"nineteen");

        for(Integer key: map.keySet())
        {
            String value = map.get(key);

            System.out.println(key + ":" + value);
        }

        System.out.println("\n");
    }
}