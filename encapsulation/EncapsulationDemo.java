package encapsulation;

import static java.lang.String.format;

public class EncapsulationDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setName("John");
        user.setEmail("jj@gmail.com");

        System.out.println(format("User[name: %s, email: %s]", user.getName(), user.getEmail()));

        // https://www.tutorialspoint.com/java/java_encapsulation.htm
    }
}
