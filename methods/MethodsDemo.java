package methods;

import static java.lang.String.format;

public class MethodsDemo {

    public static void main(String[] args) { // CLI args should be separated with spaces
        print("Java is OOP language");
        System.out.println(sum(10, 5));
        print(divide(10, 0));
        printArguments(args);
    }

    public static void print(String msg) { // modifier + return type + name + arguments(optional)
        System.out.println(msg);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String divide(double a, double b) {
        if (b == 0) {
            return "We cannot divide by zero";
        }
        return String.valueOf(a / b);
    }

    public static void printArguments(String[] args) {
        int counter = 1;
        for (String arg : args) {
            print(format("%d : %s", counter++, arg));
        }
    }
}
