package abstract1;

public class AbstractDemo {

    public static void main(String[] args) {
        Employee dev1 = new Developer("John", "john@gmail.com", 160, 2, "java");
        Developer dev2 = new Developer("George", "george@gmail.com", 160, 2.1, "python");

        System.out.println(dev1);
        System.out.println(dev2);
    }
}
