package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

@AllArgsConstructor
public enum Platform {

    ANDROID("android") {
        @SneakyThrows
        @Override
        public AppiumDriver initDriver() {
            URL url = new URL("http://localhost:4723/wd/hub");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(org.openqa.selenium.Platform.ANDROID);
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("platformVersion", "11.0");
            caps.setCapability("deviceName", "Pixel 4 API 30");
            caps.setCapability("appActivity", System.getenv("appActivity"));
            caps.setCapability("bundleId", System.getenv("bundleId"));
            caps.setCapability("appium.newCommandTimeout", "15000");
            caps.setCapability("app", System.getenv("appPath"));

            return new AndroidDriver(url, caps);
        }
    },
    IOS("ios") {
        // TODO initDriver
    };

    private final String name;

    public static Platform from(String platformName) {
        if (platformName != null) {
            for (Platform candidate : Platform.values()) {
                if (platformName.trim().equalsIgnoreCase(candidate.name))
                    return candidate;
            }
        }
        throw new IllegalArgumentException("\nUnsupported platform: " + platformName + "\n");
    }

    public AppiumDriver initDriver() {
        throw new IllegalStateException("Plz override this method.");
    }

}
