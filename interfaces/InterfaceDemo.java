package interfaces;


public class InterfaceDemo {

    public static void main(String[] args) {
        JuniorProgrammer juniorProgrammer = new JuniorProgrammer();
        juniorProgrammer.codeInJava();
        MiddleProgrammer middleProgrammer = new MiddleProgrammer();
        middleProgrammer.codeInJava();
        middleProgrammer.defaultCodeInJava();
        for (String technology : middleProgrammer.getAutomationTechnicalStack()) {
            System.out.println(technology);
        }

        // https://www.tutorialspoint.com/java/java_interfaces.htm
    }
}
