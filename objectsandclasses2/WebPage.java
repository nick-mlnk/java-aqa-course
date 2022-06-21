package objectsandclasses2;

public class WebPage {

    static String TITLE = "Landing Page"; // class variable
    int inputFieldsAmount; // instance variable
    String submitButtonColor; // instance variable

    // default constructor -> exists w/o declaration
    WebPage() {

    }

    // constructor with params
    WebPage(int inputFieldsAmount, String submitButtonColor) {
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
        return inputFieldsAmount > 0 ? inputFieldsAmount : defaultFieldsAmount;
    }

    String getSubmitButtonColor() {
        return submitButtonColor;
    }

    void clickSubmit() {
        // some code
    }
}

