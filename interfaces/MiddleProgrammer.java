package interfaces;

import static java.lang.String.format;

public class MiddleProgrammer implements HasJavaKnowledge, HasAutomationKnowledge {
    @Override
    public void codeInJava() {
        System.out.println(format("I code in %s as Middle SE", name));
    }

    @Override
    public String[] getAutomationTechnicalStack() {
        String[] technologies = {"selenide", "appium", "rest-assured"};
        return technologies;
    }
}
