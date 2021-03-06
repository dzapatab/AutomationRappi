package utils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.pmw.tinylog.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConfigCapabilities {
    private static final String DEVICE_NAME = "deviceName";
    private static final String PLATFORM_NAME = "platformName";
    private static final String PLATFORM_VERSION = "platformVersion";
    private static final String APP_PACKAGE = "appPackage";
    private static final String APP_ACTIVITY = "appActivity";
    private static final String APP = "app";
    private static final String NO_RESET = "noReset";
    private static final String AUTO_GRANT_PERMISSIONS = "true";
    private static final String LOCATION = "appLocale";
    private static final String JSON_FILE_PATH = "src/test/resources/apk/mobile_capabilities.json";
    private static JsonParser parser = new JsonParser();


    public static void applicationSetUp(DesiredCapabilities capabilities) {
        //capabilities.setCapability("app", getJsonDataProperty(APP));
        capabilities.setCapability("noReset", getJsonDataProperty(NO_RESET));
        capabilities.setCapability("autoGrantPermissions", getJsonDataProperty(AUTO_GRANT_PERMISSIONS));
        capabilities.setCapability("appLocale", getJsonDataProperty(LOCATION));
        capabilities.setCapability("appPackage", getJsonDataProperty(APP_PACKAGE));
        capabilities.setCapability("appActivity", getJsonDataProperty(APP_ACTIVITY));
    }

    /**
     * Device SetUp.
     *
     * @param capabilities : DesiredCapabilities
     * @author Diego Z
     */
    public static void deviceSetUp(DesiredCapabilities capabilities) {
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getJsonDataProperty(DEVICE_NAME));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, getJsonDataProperty(PLATFORM_VERSION));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, getJsonDataProperty(PLATFORM_NAME));
        capabilities.setCapability("automationName", "UiAutomator2");
    }

    /**
     * Method for get data form JSON file.
     *
     * @param property : String
     * @return String
     * @author Diego Z
     */
    private static String getJsonDataProperty(String property) {
        try {
            Object obj = parser.parse(new FileReader(JSON_FILE_PATH));
            JsonObject jsonObject = (JsonObject) obj;
            return jsonObject.get(property).getAsString();
        } catch (FileNotFoundException e) {
            Logger.error(e.getMessage(), e);
        } catch (Exception e) {
            Logger.error(e.getMessage(), e);
        }
        return "";
    }
}

