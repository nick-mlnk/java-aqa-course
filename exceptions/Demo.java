package exceptions;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws CustomException {
//        File file = new File("exceptions/exc.txt");
//        FileReader reader = new FileReader(file); // Checked Exc -> Compilation time

        int[] array = {5, 8, 13, 21, 34};
//        System.out.println(array[5]); // Unchecked Exc -> Runtime

        // try-catch-finally
//        try {
//            System.out.println(array[10]);
//        } catch (ArrayIndexOutOfBoundsException exc) { // multiple catch blocks can be present
//            exc.printStackTrace();
//            System.out.println("Index with this value was not found in array");
//        } finally {
//            System.out.println("Final Block");
//        }

        // try with resources
//        try (BufferedReader sampleBuffer = new BufferedReader(new FileReader("resources/file.txt"))) {
//            String line;
//            while ((line = sampleBuffer.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Custom Exception
//        try {
//            System.out.println(array[10]);
//        } catch (ArrayIndexOutOfBoundsException exc) {
//            throw new CustomException();
//        }

    }
}
