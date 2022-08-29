package utils;

public class ConfigurationManager {

    public static Platform getPlatform() {
        String platformName = System.getenv("platform");
        return Platform.from(platformName);
    }
}
