package interactions;

import hooks.BaseMobileTest;

public class ReturnResult extends BaseMobileTest {

    public static String theOfOperation(){
        String result = driver.findElementById("com.google.android.calculator:id/result_preview").getText();
        return result;
    }
}
