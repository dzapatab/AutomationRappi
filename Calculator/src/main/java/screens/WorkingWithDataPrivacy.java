package screens;
import interactions.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class WorkingWithDataPrivacy extends BaseScreen {
    @AndroidFindBy(id = "activityDataManagerAppsFlyerCheckbox")
    private AndroidElement appsFlyer;
    @AndroidFindBy(id = "activityDataManagerFirebaseCheckbox")
    private AndroidElement fireBase;
    @AndroidFindBy(id = "activityDataManagerFacebookCheckbox")
    private AndroidElement facebook;
    @AndroidFindBy(id = "activityDataManagerSaveButton")
    private AndroidElement saveItems;
    @AndroidFindBy(id = "activityDataManagerTitleTextView")
    private AndroidElement one;
    @AndroidFindBy(id = "activityDataManagerLearnMoreTextView")
    private AndroidElement two;

    /**
     * Constructor method for standard screen object.
     *
     * @param pDriver : AndroidDriver
     */
    public WorkingWithDataPrivacy(AndroidDriver<AndroidElement> pDriver) {
        super(pDriver);
    }

    /**
     * click all the states according to the given states.
     */
    public void checkDataPrivacyElements(boolean appsFlyerState, boolean fireBaseState
            , boolean facebookState) {
        clickOnSavingItems(appsFlyerState, appsFlyer);
        clickOnSavingItems(fireBaseState, fireBase);
        clickOnSavingItems(facebookState, facebook);
        saveItems.click();
    }

    /**
     * check the state of the privacy elements according to the given stats.
     * <p>
     * returns a boolean state.
     */
    public boolean checkStateDataPrivacy(boolean appsFlyerState, boolean fireBaseState
            , boolean facebookState) {
        if (returnCheckState(appsFlyer) == appsFlyerState &&
                returnCheckState(fireBase) == fireBaseState && returnCheckState(facebook) == facebookState) {
            return true;
        } else {
            return false;
        }
    }

    public String returnParagraphOne() {
        return one.getText();
    }

    public String returnParagraphTwo() {
        return two.getText();
    }
}