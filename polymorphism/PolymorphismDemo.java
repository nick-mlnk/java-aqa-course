package polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {
        Developer dev1 = new Developer("John", "john@gmail.com", "java");
        Developer dev2 = new Developer("George", "george@gmail.com", "python");

        System.out.println("Initial Setup");
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println("After compensation review");
        dev1.setMonthSalary(2.5);
        dev2.setMonthSalary(2.1, 31);
        System.out.println(dev1);
        System.out.println(dev2);

        // https://www.tutorialspoint.com/java/java_polymorphism.htm
    }
}
