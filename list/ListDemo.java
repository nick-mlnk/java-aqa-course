package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
//        list = new ArrayList(asList());
//        list = Arrays.asList();
        System.out.println(list);

        list.add("Python"); // add new elements
        list.add("Java");
        print(list);

        list.add(0, "C++"); // add new element with index
        print(list);

        System.out.println(list.size()); // amount of elements in the list
        System.out.println(list.get(0)); // get element by index
        System.out.println(list.contains("Python")); // check if list contains element
        System.out.println(list.containsAll(asList("Python", "Java"))); // check if list contains elements
        System.out.println(list.isEmpty()); // check if list is empty
        System.out.println(list.remove("C++")); // remove and return true if element was successfully removed
        System.out.println(list.removeAll(asList("C++"))); // remove all from the list
        System.out.println(list.retainAll(asList("Java"))); // remove all except of values from Arg List
        System.out.println(list.set(0, "Go")); // replace existing element with new one and returns old element
        print(list);
        List<String> list2 = new ArrayList(asList("C++", "Java", "Python"));
        System.out.println(list.equals(list2)); // check if two lists are equal
        list.sort(new Comparator<String>() { // sort elements in the list
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });
        for (String s : list) { // using loop
            System.out.println("Element: " + s);
        }
        System.out.println(list);
        list.clear(); // makes list empty

        // https://www.tutorialspoint.com/java/java_list_interface.htm

    }

    public static void print(List list) {
        System.out.println(list.toString());
    }
}
