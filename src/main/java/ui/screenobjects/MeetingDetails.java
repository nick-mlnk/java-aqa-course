package ui.screenobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class MeetingDetails extends BaseScreen {

    private By headerTitle = accessibilityId("meeting-details-header-title");

    public String getHeaderTitle() {
        return $(headerTitle).getText();
    }
}
