package examples.mobile;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.screenobjects.MeetingsScreen;
import utils.Platform;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static ui.screenobjects.BaseScreen.openApp;
import static utils.ConfigurationManager.getPlatform;

public class ExampleScreenObjectTest {

    @BeforeMethod
    public void setup() {
        Platform platform = getPlatform();
        WebDriverRunner.setWebDriver(platform.initDriver());
    }

    @Test
    public void testMeetingTitle() {
        MeetingsScreen meetingsScreen = openApp()
                .navigateToMeetings();
        String meetingTitle = meetingsScreen.getFirstMeeting()
                .getTitle();
        String meetingTitleOnDetailsScreen = meetingsScreen.selectFirstMeeting()
                .getHeaderTitle();

        assertThat(meetingTitle)
                .as("Meeting Title")
                .isEqualTo(meetingTitleOnDetailsScreen);
    }

    @AfterMethod
    public void quitDriver() {
        Selenide.closeWebDriver();
    }
}
