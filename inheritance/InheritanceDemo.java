package inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        Developer dev1 = new Developer("John", "john@gmail.com", "java");
        Employee dev2 = new Developer("George", "george@gmail.com", "python");

        System.out.println(dev1);
        System.out.println(dev2);

        // https://www.tutorialspoint.com/java/java_inheritance.htm
    }
}
