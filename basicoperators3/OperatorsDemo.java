package basicoperators3;

import static java.lang.String.format;

public class OperatorsDemo {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int add = a + b;
        long sub = a - b; // Widening Implicit type casting, automatic: byte -> short -> char -> int -> long -> float -> double
        short multi = (short) (a * b); // Narrowing type casting, manual: double -> float -> long -> int -> char -> short -> byte
        float div = a / b;
        int mod = a % b;
        a++; // increment
        b--; // decrement

        System.out.println(format("Add: %d\nSub: %d\nMulti: %d\nDiv: %f\nMod: %d\na: %d\nb: %d", add, sub, multi, div, mod, a, b));

        // Relational Operators
        System.out.println(format("10 equals 10: %s", 10 == 10));
        System.out.println(format("10 not equals 9: %s", 10 != 9));
        System.out.println(format("10 greater than 9: %s", 10 > 9));
        System.out.println(format("10 less than or equals 9: %s", 10 <= 9));

        // Logical Operators
        System.out.println(format("10 greater than 9 AND String is empty: %s", 10 > 9 && "".isEmpty())); // && -> AND
        System.out.println(format("10 greater than 9 OR String is empty: %s", 10 > 9 || "LOGICAL".isEmpty())); // || -> OR
        System.out.println(format("String is NOT empty: %s", !"LOGICAL".isEmpty())); // ! -> NOT

        // Assignment Operators
        int simple = 10 + 10; // =
        simple += simple; // +=
        simple -= 10; // -=
        simple *= simple; // *=
        simple /= simple; // /=
        System.out.println(simple);

        // Conditional Ternary Operator
        int cond = (10 > 9) ? 100 : 50;
        System.out.println(cond); // (condition) ? value if true : value if false

        // instanceof Operator
        String str = "Some String Value";
        boolean result = str instanceof String;
        System.out.println(format("[%s] is instance of type String: %s", str, result));

        // https://www.tutorialspoint.com/java/java_basic_operators.htm
    }
}
