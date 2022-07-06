package set;

import java.util.*;


public class SetDemo {

    public static void main(String[] args) {
        // API of Hashset looks similar to List except of few items
//        Set<String> set = new HashSet<>();
        Set<String> set = new HashSet<>(Arrays.asList("Java", "Python"));
//        print(set);

        set.add("C++");
        set.add("C++"); // will not be added
//        print(set);
//        for (String s : set) { // using loop
//            System.out.println(s);
//        }

        Iterator<String> i = set.iterator();
        while (i.hasNext()) { // remove elements in the loop
            System.out.println(i.next());
            i.remove();
        }
        print(set);

        // https://www.tutorialspoint.com/java/java_set_interface.htm
    }

    public static void print(Collection collection) {
        System.out.println(collection.toString());
    }
}
