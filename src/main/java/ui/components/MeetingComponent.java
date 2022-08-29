package ui.components;


import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static io.appium.java_client.AppiumBy.accessibilityId;

public class MeetingComponent {

    @Getter
    private SelenideElement element;
    private SelenideElement title;

    public MeetingComponent(SelenideElement element) {
        this.element = element;
        this.title = this.element.$(accessibilityId("meeting-item-title"));
    }

    public String getTitle() {
        return this.title.getText();
    }
}
