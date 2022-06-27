package arrays2;

import java.util.Arrays;

import static java.lang.String.format;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = {100, 50, 200};
        int[] array = new int[3]; // array that can consist 3 items
        array[0] = 100;
        array[1] = 50;
        array[2] = 200;
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(format("%d : %d", i, array[i])); // print with indexes of elements
        }

        array = Arrays.copyOf(array, 5); // extend existing array via the copy method
        printArray(array);

        Arrays.sort(array); // Sorts the specified array into an ascending order
        printArray(array);

        // https://www.tutorialspoint.com/java/java_arrays.htm
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }
}
