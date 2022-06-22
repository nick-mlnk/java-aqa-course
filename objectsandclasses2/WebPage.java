package objectsandclasses2;

public class WebPage {


    public static String TITLE = "Landing Page"; // class variable
    private int inputFieldsAmount; // instance variable
    protected String submitButtonColor; // instance variable

    // default constructor -> exists w/o declaration
    public WebPage() {

    }

    // constructor with params
    public WebPage(int inputFieldsAmount, String submitButtonColor) {
        this.inputFieldsAmount = inputFieldsAmount;
        this.submitButtonColor = submitButtonColor;
    }

    // Setter
    void setInputFieldsAmount(int inputFieldsAmount) {
        this.inputFieldsAmount = inputFieldsAmount;
    }

    // Getter
    int getInputFieldsAmount() {
        int defaultFieldsAmount = 3; // local variable
        return inputFieldsAmount + defaultFieldsAmount; // ternary operator
    }

    String getSubmitButtonColor() {
        return submitButtonColor;
    }

    void clickSubmit() {
        // some code
    }
}

