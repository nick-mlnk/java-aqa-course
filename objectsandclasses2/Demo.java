package objectsandclasses2;

public class Demo {

    public static void main(String[] args) {
        WebPage webPage1, webPage2; // Declaration
        webPage1 = new WebPage(); // Initialization via default constructor
        webPage2 = new WebPage(5, "Green"); // Initialization via parametrized constructor
        webPage1.setInputFieldsAmount(10);
        webPage1.clickSubmit();
        webPage2.getInputFieldsAmount();
        String str = WebPage.TITLE;

        // https://www.tutorialspoint.com/java/java_object_classes.htm
        // https://www.tutorialspoint.com/java/java_constructors.htm
        // https://www.tutorialspoint.com/java/java_modifier_types.htm
        // TODO add modifier types
    }
}
