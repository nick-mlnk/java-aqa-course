package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
//        map.put(1, "C++"); // will overwrite record {1: ""Java}
//        print(map);

//        System.out.println(map.get(1));
//        print(map.keySet()); // returns set of keys
//        print(map.values()); // returns set of values
//        System.out.println(map.replace(1, "C++")); // replace and get old Value
//        System.out.println(map.replace(1, "Java", "C++"));
//        System.out.println(map.containsKey(2));
//        System.out.println(map.containsValue("Java"));
//        System.out.println(map.getOrDefault(3, "JS"));
//        System.out.println(map.putIfAbsent(3, "C++")); // put new value if key is absent
//        System.out.println(map.remove(1)); // removes and returns value
//        System.out.println(map.remove(1, "Java")); // removes and returns boolean
//        map.clear(); // makes map empty
//        print(map);

//        https://www.tutorialspoint.com/java/java_map_interface.htm
    }

    private static void print(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(String.format("{%s : %s}", entry.getKey(), entry.getValue()));
        }
    }

    private static void print(Collection collection) {
        System.out.println(collection.toString());
    }
}
