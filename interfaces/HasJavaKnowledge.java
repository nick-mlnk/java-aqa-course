package interfaces;

import static java.lang.String.format;

public interface HasJavaKnowledge {

    String name = "JAVA"; // final, static field

    void codeInJava(); // abstract method

    default void defaultCodeInJava() { // default method
        System.out.println(format("default coding in Java", name));
    }
}
