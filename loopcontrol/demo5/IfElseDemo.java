package loopcontrol.demo5;

public class IfElseDemo {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 13, 21};
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println("Even number was found: " + number);
            } else {
                System.out.println(number + " is not even number");
            }
        }

        // https://www.tutorialspoint.com/java/if_statement_in_java.htm
        // https://www.tutorialspoint.com/java/if_else_statement_in_java.htm
    }
}
