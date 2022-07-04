package enums;

public class EnumsDemo {

    public static void main(String[] args) {
        Environment environment = Environment.DEV;
        System.out.println(environment);

        System.out.println(Environment.valueOf("PROD")); // get Env from value

        for (Environment env : Environment.values()) { // all values()
            System.out.println(env);
        }

        for (Environment env : Environment.values()) { // with overrided methods
            env.print();
        }

        // https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html#:~:text=An%20enum%20type%20is%20a,the%20days%20of%20the%20week.
    }
}
