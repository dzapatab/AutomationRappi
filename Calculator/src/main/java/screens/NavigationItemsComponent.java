package screens;
import interactions.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class NavigationItemsComponent extends BaseScreen {
    /**
     * Constructor method for standard NavigationItemsComponent object.
     *
     * @param pDriver : AndroidDriver
     */
    public NavigationItemsComponent(AndroidDriver<AndroidElement> pDriver) {
        super(pDriver);
    }

    public boolean navigationBar(String text) {
        return visibilityOfElement(text);
    }

    public SettingsScreen settingsScreen() {
        return new SettingsScreen(driver);
    }
}
