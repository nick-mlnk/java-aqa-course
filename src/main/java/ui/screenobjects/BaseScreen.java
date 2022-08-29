package ui.screenobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.ScreenObject.screen;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class BaseScreen {

    protected static By homeLink = accessibilityId("dashboard-icon");
    protected static By meetingsLink = accessibilityId("meetings-icon");

    public static HomeScreen openApp() {
        return screen(HomeScreen.class);
    }

    public MeetingsScreen navigateToMeetings() {
        $(meetingsLink).click();
        return screen(MeetingsScreen.class);
    }
}
