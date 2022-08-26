package examples.mobile;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.openqa.selenium.By.xpath;

public class ExampleTest {

    @SneakyThrows
    @BeforeMethod
    public void setup() {
        URL url = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setPlatform(Platform.ANDROID);
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Pixel 4 API 30");
        caps.setCapability("appActivity", System.getenv("appActivity"));
        caps.setCapability("bundleId", System.getenv("bundleId"));
        caps.setCapability("appium.newCommandTimeout", "15000");
        caps.setCapability("app", System.getenv("appPath"));

        AppiumDriver driver = new AndroidDriver(url, caps);
        WebDriverRunner.setWebDriver(driver);
    }

    @Test
    public void test() {
        $(accessibilityId("meetings-icon")).click();
        $$(accessibilityId("meeting-item")).first().click();

        assertThat($(xpath("//android.view.View[@content-desc=\"meeting-details-navigationBar\"]/android.widget.TextView")).getText())
                .as("Meeting Details Header title")
                .isEqualTo("Meeting");

    }

    @AfterMethod
    public void quitDriver() {
        Selenide.closeWebDriver();
    }
}
