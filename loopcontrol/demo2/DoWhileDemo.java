package loopcontrol.demo2;

public class DoWhileDemo {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println(counter++);
        } while (counter != 10); // tests the condition at the end of the loop body

        // https://www.tutorialspoint.com/java/java_do_while_loop.htm
    }
}
